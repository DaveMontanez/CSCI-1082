package pa3;

import java.text.NumberFormat;
import java.util.Locale;

public class Faculty extends Person{
	
	private double salary;
	private String department;
	private boolean isFullTime;
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public boolean isFullTime() {
		return isFullTime;
	}
	
	public void setFullTime(boolean isFullTime) {
		this.isFullTime = isFullTime;
	}
	
	@Override 
	public String toString(){
		Locale locale = new Locale("en", "US");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
		String salaryFormatted = currencyFormatter.format(salary);
		return super.toString() + "\tDepartment: " + department + 
				"\n\tFull Time: " + isFullTime + "\n\tSalary: " + salaryFormatted + "\n";
	}
}
