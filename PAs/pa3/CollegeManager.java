package pa3;

import java.util.Scanner;

public class CollegeManager {
	
	public static void main(String[] args) {
		
		Scanner userIn = new Scanner(System.in);
		int studentCount = 0;
		int facultyCount = 0;
		String personType, firstName, lastName, address, phoneNumber;
		String major, department;
		double gpa, salary = 0;
		boolean isFullTime;
		boolean studentsFull = false;
		boolean facultyFull = false;
		
		
		//Declare and initialize new arrays
		Student[] students = new Student[3];
		Faculty[] faculty = new Faculty[3];
		
		for (int i=0; i<3; i++){
			students[i] = new Student();
		}
		
		for (int i=0; i<3; i++){
			faculty[i] = new Faculty();
		}
		
		//Ask user for person type: S, F, or Q if student/faculty count is less than 3.		
		while (!studentsFull || !facultyFull){
			System.out.println("Select the occupation of the person you'd like to enter: \n"
					+ " [S] for Student\n [F] for Faculty\n [Q] or 'Quit' to quit");
			personType = userIn.nextLine();
			switch (personType.toUpperCase()) {
			case "S":
				if (studentCount < 3){
					System.out.println("Enter First Name: ");
					firstName = userIn.nextLine();
					students[studentCount].setFirstName(firstName);
					System.out.println("Enter Last Name: ");
					lastName = userIn.nextLine();
					students[studentCount].setLastName(lastName);
					System.out.println("Enter Address: ");
					address = userIn.nextLine();
					students[studentCount].setAddress(address);
					System.out.println("Enter Phone Number: ");
					phoneNumber = userIn.nextLine();
					students[studentCount].setPhoneNumber(phoneNumber);
					System.out.println("Enter Major: ");
					major = userIn.nextLine();
					students[studentCount].setMajor(major);
					System.out.println("Enter GPA: ");
					gpa = userIn.nextDouble();
					String junk = userIn.nextLine();
					students[studentCount].setGpa(gpa);	
					studentCount++;
				} else {
					System.out.println("ERROR: Reached maximum allowed number of Students: 3");
					studentsFull = true; }
				break;			
			case "F":
				if (facultyCount < 3){
					System.out.println("Enter First Name: ");
					firstName = userIn.nextLine();
					faculty[facultyCount].setFirstName(firstName);
					System.out.println("Enter Last Name: ");
					lastName = userIn.nextLine();
					faculty[facultyCount].setLastName(lastName);
					System.out.println("Enter Address: ");
					address = userIn.nextLine();
					faculty[facultyCount].setAddress(address);
					System.out.println("Enter Phone Number: ");
					phoneNumber = userIn.nextLine();
					faculty[facultyCount].setPhoneNumber(phoneNumber);
					System.out.println("Enter Department: ");
					department = userIn.nextLine();
					faculty[facultyCount].setDepartment(department);
					System.out.println("Enter Salary: ");					
					faculty[facultyCount].setSalary(salary);
					System.out.println("Enter isFullTime");
					String fullTime = userIn.nextLine();
					if (fullTime.equalsIgnoreCase("true")){
						isFullTime = true;
					} else {isFullTime = false;}
					faculty[facultyCount].setFullTime(isFullTime);
					facultyCount++;
				} else {
					System.out.println("ERROR: Reached maximum allowed number of Faculty: 3");
					facultyFull = true; }
				break;
			case "Q":
				//Quit: Display student and faculty info
				for (int i=0; i<studentCount; i++){
					students[i].toString();
				}
				for (int i=0; i<facultyCount; i++){
					faculty[i].toString();
				}
			}
			
			//Outside of while loop if students and faculty are full. 
			//Display student and faculty info
			for (int i=0; i<studentCount; i++){
				students[i].toString();
			}
			for (int i=0; i<facultyCount; i++){
				faculty[i].toString();
			}
		}
	}
}
