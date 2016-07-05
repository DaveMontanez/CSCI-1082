package calculator;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame{

	private JTextArea display = new JTextArea(3, 10);
	private JButton btn1 = new JButton("1");
	private JButton btn2 = new JButton("2");
	private JButton btn3 = new JButton("3");
	private JButton btn4 = new JButton("4");
	private JButton btn5 = new JButton("5");
	private JButton btn6 = new JButton("6");
	private JButton btn7 = new JButton("7");
	private JButton btn8 = new JButton("8");
	private JButton btn9 = new JButton("9");
	private JButton btn0 = new JButton("0");
	private JButton btnDot = new JButton(".");	
	private JButton btnDiv = new JButton("/");
	private JButton btnMult = new JButton("*");
	private JButton btnSub = new JButton("-");
	private JButton btnAdd = new JButton("+");
	private JButton btnEquals = new JButton("=");
	private JButton btnClear = new JButton("C");
	
	Font font = new Font("Britannic Bold", Font.BOLD, 14);
	
	private double firstNum, secondNum;
	
	CalculatorView(){		
		super("Calculator");
		setSize(300, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		

		JPanel calcPanel = new JPanel(new BorderLayout());
		
		JPanel upperPanel = new JPanel(new GridLayout());
		upperPanel.add(display);
		calcPanel.add(upperPanel, BorderLayout.NORTH);
		
		JPanel lowerPanel = new JPanel(new BorderLayout());
		JPanel numPanel = new JPanel(new GridLayout(4,4));
		numPanel.add(btn7);
		numPanel.add(btn8);
		numPanel.add(btn9);
		numPanel.add(btnDiv);
		numPanel.add(btn4);
		numPanel.add(btn5);
		numPanel.add(btn6);
		numPanel.add(btnMult);
		numPanel.add(btn1);
		numPanel.add(btn2);
		numPanel.add(btn3);
		numPanel.add(btnSub);
		numPanel.add(btn0);
		numPanel.add(btnDot);
		numPanel.add(btnClear);
		numPanel.add(btnAdd);
		JPanel equalsPanel = new JPanel(new GridLayout());
		equalsPanel.add(btnEquals);
		
		lowerPanel.add(numPanel, BorderLayout.CENTER);
		lowerPanel.add(equalsPanel, BorderLayout.EAST);
		
		calcPanel.add(upperPanel, BorderLayout.NORTH);
		calcPanel.add(lowerPanel, BorderLayout.CENTER);
		
		add(calcPanel);
				
	}
	
	public static void main(String[] args) {
		CalculatorView calcFrame = new CalculatorView();
		calcFrame.setVisible(true);
	}
	
	public double getFirstNumber(){
		return Double.parseDouble(display.getText());
	}
	
	public double getSecondNumber(){
		return Double.parseDouble(display.getText());
	}
	
	public void setFirstNumber(double numOne){
		display.setText(Double.toString(numOne));
	}
	
	public void setSecondNumber(double numTwo){
		display.setText(Double.toString(numTwo));
	}
	
	public void setSolution(double solution){
		display.setText(Double.toString(solution));
	}
	
	public void clear(){
		try {
			display.setText("");
		} catch (NullPointerException e){
			displayErrorMessage("Already clear bruh");
		}
	}
	
	//If Equals button is clicked,execute method
	// in the controller named actionPerformed
	void addCalculationListener(ActionListener listenForCalcButton){		
		btnEquals.addActionListener(listenForCalcButton);
	}
	
	//Open popup that contains the error message passed
	void displayErrorMessage(String error){
		JOptionPane.showMessageDialog(this, error);		
	}
	
}
