package lab9;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class FileIO {
	
	public static void main(String[] args) {
		
		PrintWriter outStream = null;
		
		//Create new file and output stream, display error if caught
		try 
		{
			outStream = new PrintWriter(new FileOutputStream("data.txt"));			
		} catch(FileNotFoundException e) {
			System.out.print("File not found");
			e.printStackTrace();
		}
		
		//Print 100 randomly integers between 1 and 100
		System.out.println("Writing 100 random integers to file...");			
		for (int i=0; i<100; i++){
			outStream.println((int) (Math.random() * 101));
		}		
		outStream.close();	//Flush and close.
		
		
		//Create Scanner object and new PrintWriter object
		Scanner inStream = null;
		PrintWriter outdataStream = null;
		
		//Create new input stream to data.txt, and new output stream to outdata.txt
		try
		{
			inStream = new Scanner(new FileInputStream("data.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File not found or cannot be opened.");
			e.printStackTrace();
		}
		try 
		{
			outdataStream = new PrintWriter(new FileOutputStream("outdata.txt"));			
		} catch(FileNotFoundException e) {
			System.out.print("File not found");
			e.printStackTrace();
		}
		
		while (inStream.hasNextLine()){
			String s = inStream.nextLine();
			outdataStream.println(s);
		}
		inStream.close();
		outdataStream.close();
		
		System.out.println("End of program.");
	}

}