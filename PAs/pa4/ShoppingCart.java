package pa4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShoppingCart {
	
	public static void main(String[] args) {	
		//Declare variables for making Item objects.
		int newUID;
		String newName, newDesc;
		double newPrice;
		
		//Create ArrayList for Item objects
		ArrayList<Item> itemList = new ArrayList<>();		
		
		/* Create new Scanner object for reading text file.
		   Create new PrintWriter object for writing to new file. */		
		Scanner inFile = null;
		PrintWriter outFile = null;
		try {
			inFile = new Scanner(new FileInputStream("unsortedItems.txt"));
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		try 
		{
			outFile = new PrintWriter(new FileOutputStream("sortedItems.txt"));			
		} catch(FileNotFoundException e) {
			System.out.print("File not found");
			e.printStackTrace();
		}
		
		/* Create new Item objects from text file information. 
		   Add objects to itemList. */
		while (inFile.hasNextLine()) {
			newUID = inFile.nextInt();
			newName = inFile.next();
			newDesc = inFile.next();
			newPrice = inFile.nextDouble();
			
			Item item = new Item(newUID, newName, newDesc, newPrice);
			itemList.add(item);			
		}
		
		//Display unsorted itemList
		arrayDisplay(itemList);
		
		//Sort now-filled itemArray using Collections.
		Collections.sort(itemList);
		
		//Write sorted arrayList contents to sortedItems.txt.
		for (int i = 0; i < itemList.size(); i++) {
			Item item = itemList.get(i);
			String itemInfo = item.getUID() + " " + item.getName() + " " +
					item.getDescription() + " " + item.getPrice();
			outFile.println(itemInfo);		
		}
		
		//Display sorted Array
		arrayDisplay(itemList);

		inFile.close();
		outFile.close();
		
		//Search for items with uid 1773 and 1337.
		arraySearch(itemList, 1773);
		arraySearch(itemList, 1337);
		
	}	
	
	//Method to search itemList for item with specific uid.
	private static void arraySearch(ArrayList<Item> itemList, int uid){
		boolean found = false;
		Integer searchUID = uid;
		
		for (Item item : itemList) {
			Integer itemUID = item.getUID();
			if (itemUID.equals(searchUID)) {
				found = true;
			} 
		}
		
		if (found) {
			System.out.println("\nItem with uid: " + uid + " found!!");
		} else {
			System.out.println("Item with uid: " + uid + " NOT found!!");
		}
	}
	
	//Method to display ArrayList
	private static void arrayDisplay(ArrayList<Item> itemList){
		
		System.out.println("\n**********************************************");
		for (Item item : itemList){
			System.out.println(item.getUID() + " " + item.getName() + " " +
					item.getDescription() + " " + item.getPrice());
		}
		System.out.println("**********************************************");
	}

}
