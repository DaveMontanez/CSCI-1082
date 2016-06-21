package pa3;

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
		String facultyInfo = "\tFirst Name: " + this.getFirstName() + "\n\tLastName: "
				+ this.getLastName() + "\n\tAddress: " + this.getAddress() + "\n\tPhone: "
				+ this.getPhoneNumber() + "\n\tDepartment: " + this.department + 
				"\n\tFull Time: " + this.isFullTime + "\n\tSalary: " + salary;
		return facultyInfo;
	}
}
