package pa3;

public class Student extends Person{

	private double gpa;
	private String major;
	
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
		String studentInfo = "\tFirst Name: " + this.getFirstName() + "\n\tLastName: "
				+ this.getLastName() + "\n\tAddress: " + this.getAddress() + "\n\tPhone: "
				+ this.getPhoneNumber() + "\n\tMajor: " + this.major + "\n\tGPA: " + this.gpa;
		return studentInfo;
	}
}
