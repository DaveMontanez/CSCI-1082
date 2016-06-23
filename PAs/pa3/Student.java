package pa3;

public class Student extends Person{

	private double gpa;
	private String major;
	
	public Student(){
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
		
	@Override
	public String toString(){
		return super.toString() + "\tMajor: " + major 
				+ "\n\tGPA: " + gpa + "\n";
	}
}
