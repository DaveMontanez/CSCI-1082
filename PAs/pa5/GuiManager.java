package pa5;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;
import javax.swing.UIManager.*;

public class GuiManager extends JFrame implements ActionListener{
	
	private JPanel topPanel  = new JPanel(new BorderLayout());
	private JPanel searchPanel = new JPanel();
	private JPanel infoPanel = new JPanel(new GridLayout(4,2));
	private JPanel editPanel = new JPanel(new GridLayout(1,3));
	private JPanel bottomPanel = new JPanel(new BorderLayout());
	private JTextArea displayArea = new JTextArea(10, 10);
	private JTextField searchField = new JTextField(10);
	private JTextField uidField = new JTextField(10);
	private JTextField nameField = new JTextField(10);
	private JTextField descriptionField = new JTextField(10);
	private JTextField priceField = new JTextField(10);	
	private JLabel searchLabel = new JLabel("Enter Item's name: ");
	private JLabel uidLabel = new JLabel("   UID");
	private JLabel nameLabel = new JLabel("   Name");	
	private JLabel descriptionLabel = new JLabel("   Description");
	private JLabel priceLabel = new JLabel("   Price");
	private JButton searchBtn = new JButton("Search");
	private JButton createBtn = new JButton("Create");
	private JButton displayBtn = new JButton("Display");
	private JButton deleteBtn = new JButton("Delete");
	
	Font font = new Font("Apple Casual", Font.BOLD, 20);
	final Runnable SOUND = (Runnable)Toolkit.getDefaultToolkit().getDesktopProperty
		    ("win.sound.default");
	
	private static ArrayList<Item> itemList = new ArrayList<>();
	
	GuiManager(){
		super("Shopping List");
		setLayout(new GridLayout(2,1));
		setResizable(false);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		searchBtn.addActionListener(this);
		createBtn.addActionListener(this);
		displayBtn.addActionListener(this);
		deleteBtn.addActionListener(this);		
		
		searchPanel.add(searchLabel);
		searchPanel.add(searchField);
		searchPanel.add(searchBtn);
		topPanel.add(searchPanel, BorderLayout.NORTH);
		
		infoPanel.add(uidLabel);
		infoPanel.add(uidField);
		infoPanel.add(nameLabel);
		infoPanel.add(nameField);
		infoPanel.add(descriptionLabel);
		infoPanel.add(descriptionField);
		infoPanel.add(priceLabel);
		infoPanel.add(priceField);
		topPanel.add(infoPanel, BorderLayout.CENTER);
		
		editPanel.add(createBtn);
		editPanel.add(displayBtn);
		editPanel.add(deleteBtn);
		topPanel.add(editPanel, BorderLayout.SOUTH);
		
		displayArea.setFont(font);
		JScrollPane scrollPane = new JScrollPane(displayArea);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		bottomPanel.add(displayArea, BorderLayout.CENTER);
		
		add(topPanel);
		add(bottomPanel);
		
		
						
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String btnName = e.getActionCommand();

		if (btnName.equals("Search")){
			clearDisplay();
			String itemName = searchField.getText();
			if (itemName != null) {
				for (Item item : itemList) {
					if (item.getName().equalsIgnoreCase(itemName)){
						displayArea.setText(item.toString());
					} else displayArea.setText("Item: " + itemName + " not found.");
				}
			} else {
				if(SOUND != null) SOUND.run();
				displayErrorMessage("Enter item name to search"); 
			}
		} else if (btnName.equalsIgnoreCase("Create")) {
			Integer itemUID = new Integer(Integer.parseInt(uidField.getText()));
			String itemName = nameField.getText();
			String itemDescription = descriptionField.getText();
			Double itemPrice = Double.parseDouble(priceField.getText());
			//Add checks for data types.
			Item item = new Item(itemUID, itemName, itemDescription, itemPrice);
			itemList.add(item);	
			displayArea.setText("Item: " + itemName + "added.");
		} else if (btnName.equalsIgnoreCase("Display")){
			clearDisplay();
			if (itemList.size() > 0) {
				for (Item item : itemList){
					displayArea.append(item.toString());
				} 
			} else {
				displayArea.setText(" No items currently in list.");
				}
		} else if (btnName.equalsIgnoreCase("Delete")) {
			clearDisplay();
			String itemName = searchField.getText();
			if (itemList.size() > 0) {
				for (Iterator<Item> it = itemList.iterator(); it.hasNext(); ){
					Item item = it.next();
					if (item.getName().equalsIgnoreCase(itemName)){
						it.remove();
					}
				}
			} else if (itemName == null) {
				if(SOUND != null) SOUND.run();
				displayErrorMessage("Enter item name to search");
			}
		}
		
	}	
	
	//Clear display
	public void clearDisplay(){
		try {
			displayArea.setText("");
		} catch (NullPointerException e){
			displayErrorMessage("Already clear bruh");
		}
	}
	
	//Open popup that contains the error message passed
	void displayErrorMessage(String error){
			JOptionPane.showMessageDialog(this, error);		
		}
		
	public static void main(String[] args) {
		//Set window look and feel.
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		GuiManager gui = new GuiManager();
		gui.setVisible(true);
		
		itemList.add(new Item(1337, "Banana", "yellow fruit", 0.50));
		itemList.add(new Item(8010, "Light Bulb", "bright light", 2.99));
		itemList.add(new Item(2000, "Orange Juice", "juice of an orange", 4.99));
		
	}

}
