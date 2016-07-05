package calculator;

public class CalculatorModel {
	
	private double calcValue;
	
	public void addNumbers(double firstNum, double secondNum){		
		calcValue =  firstNum + secondNum;
	}
	
	public void subtractNumbers(double firstNum, double secondNum){		
		calcValue =  firstNum - secondNum;
	}
	
	
	public void multiplyNumbers(double firstNum, double secondNum){		
		calcValue =  firstNum * secondNum;
	}
	
	public void divideNumbers(double firstNum, double secondNum){		
		calcValue =  firstNum / secondNum;
	}
	
	public double getCalcValue(){
		return calcValue;
	}
}
