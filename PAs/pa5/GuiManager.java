package pa5;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

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
	private JLabel uidLabel = new JLabel("UID");
	private JLabel nameLabel = new JLabel("Name");	
	private JLabel descriptionLabel = new JLabel("Description");
	private JLabel priceLabel = new JLabel("Price");
	private JButton searchBtn = new JButton("Search");
	private JButton createBtn = new JButton("Create");
	private JButton displayBtn = new JButton("Display");
	private JButton deleteBtn = new JButton("Delete");
	Font font = new Font("Britannic Bold", Font.BOLD, 20);
	private ArrayList<Item> itemList = new ArrayList<>();
	
	GuiManager(){
		super("Shopping List");
		setLayout(new GridLayout(2,1));
		setResizable(false);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		
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
		bottomPanel.add(displayArea, BorderLayout.CENTER);
		
		add(topPanel);
		add(bottomPanel);
						
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		GuiManager gui = new GuiManager();
		gui.setVisible(true);
	}

}
