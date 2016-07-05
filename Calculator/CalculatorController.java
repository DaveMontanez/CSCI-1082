package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	
	private CalculatorView view;
	private CalculatorModel model;
	
	public CalculatorController(CalculatorView view, CalculatorModel model){
		
		this.view = view;
		this.model = model;
		
		this.view.addCalculationListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e){
			
			double firstNum, secondNum = 0;
			
			try
			{
				firstNum = view.getFirstNumber();
				secondNum = view.getSecondNumber();
				
				model.addNumbers(firstNum, secondNum);
				
				view.setSolution(model.getCalcValue());
			} catch (NumberFormatException ex) {
				view.displayErrorMessage("Please enter two numbers");
			}
			
		}
	}

}
