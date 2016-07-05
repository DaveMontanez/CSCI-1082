package lab11;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class Calculator extends JFrame {
	private JButton bigBtn;
	private JTextField displayTxt;
	
	public Calculator(){
		super("Calculator");	
		setLayout(new GridLayout(1, 2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,400);
		
		//Create left side of frame.
		bigBtn = new JButton("Big Button");
		add(bigBtn);
		
		//Create right side of frame.
		JPanel rightPanel = new JPanel(new BorderLayout());
		displayTxt = new JTextField(10);		
		rightPanel.add(displayTxt, BorderLayout.NORTH);		//Add Text Field
		JPanel numPanel = new JPanel((new GridLayout(4, 3)));
		ArrayList<JButton> buttonList = new ArrayList<JButton>();  //ArrayList for buttons
		buttonList.add(new JButton("1"));
		buttonList.add(new JButton("2"));
		buttonList.add(new JButton("3"));
		buttonList.add(new JButton("4"));
		buttonList.add(new JButton("5"));		
		buttonList.add(new JButton("6"));
		buttonList.add(new JButton("7"));
		buttonList.add(new JButton("8"));
		buttonList.add(new JButton("9"));
		buttonList.add(new JButton("0"));
		buttonList.add(new JButton("Start"));
		buttonList.add(new JButton("Stop"));		
		for (int i = 0; i < buttonList.size(); i++){	//Populate grid with buttons
			numPanel.add(buttonList.get(i));
		}		
		rightPanel.add(numPanel, BorderLayout.CENTER);  //Add numPanel 
		add(rightPanel);
		
	}
	
	public static void main(String[] args) {
		Calculator calcFrame = new Calculator();
		calcFrame.setVisible(true);
	}
	
}
