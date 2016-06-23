package pa3;

import java.util.Scanner;

public class CollegeManager {
	
	public static void main(String[] args) {
		//New scanner object for user input
		Scanner userIn = new Scanner(System.in);
		
		//Declare variables
		int studentCount = 0;
		int facultyCount = 0;
		String personType, firstName, lastName, address, phoneNumber;
		String major, department;
		double gpa, salary = 0;
		boolean isFullTime;		
		
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
		Outer:
		while (studentCount < 3 || facultyCount < 3){
			System.out.println("\nSelect the occupation of the person you'd like to enter: \n"
					+ " [S] for Student\n [F] for Faculty\n [Q] or 'Quit' to quit");
			personType = userIn.nextLine();
			switch (personType.toUpperCase()) {
			case "S":
				//Get Student info from user and populate array accordingly.
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
					//Display error if studentCount is 3 or more.
					System.out.println("ERROR: Reached maximum allowed number of Students: 3");
				}
				break;			
			case "F":
				//Get Faculty info from user and populate array accordingly.
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
					salary = userIn.nextDouble();
					String junk1 = userIn.nextLine();
					faculty[facultyCount].setSalary(salary);
					System.out.println("Enter isFullTime, (T)rue or (F)alse: ");					
					String fullTime = userIn.nextLine();
					//Check for correct user input. If invalid, continue to outer while loop.
					if (fullTime.equalsIgnoreCase("true") || fullTime.equalsIgnoreCase("t")){
						isFullTime = true; 
						}
					else if (fullTime.equalsIgnoreCase("false") || fullTime.equalsIgnoreCase("f")){
						isFullTime = false;
						}
					else {
						System.out.println("\nPlease enter isFullTime correctly (T or F).\n");
						continue Outer; 
						}					
					faculty[facultyCount].setFullTime(isFullTime);
					facultyCount++;
				}
				else {
					//Display error if facultyCount is 3 or more.
					System.out.println("\nERROR: Reached maximum allowed number of Faculty: 3\n"); }				
				break;
			case "Q": case "QUIT":
				//Quit after displaying student and faculty info		
				System.out.println("\n******Students******");
				System.out.println("Student Record: ");
				//Use student and faculty counters to display only user-entered people.
				if (studentCount >= 1){
					for (int i=0; i<studentCount; i++){					
						System.out.println(students[i].toString()); 
						}
				} else { 
					System.out.println("\nNo students listed.\n");  
				}
				System.out.println("\n******Faculty******");
				System.out.println("Faculty Record: ");
				if (facultyCount >= 1){
					for (int i=0; i<facultyCount; i++) {					
						System.out.println(faculty[i].toString()); 
						}
				} else {
					System.out.println("\nNo faculty listed.\n");
					}
				System.exit(0);
			}			
		}
		
		/*Outside of while loop if students and faculty are full. 
		  Display student and faculty info. */
		System.out.println("\n******Students******");
		System.out.println("Student Record: ");
		for (int i=0; i<studentCount; i++){					
			System.out.println(students[i].toString());
		}
		System.out.println("\n******Faculty******");
		System.out.println("Faculty Record: ");
		for (int i=0; i<facultyCount; i++){					
			System.out.println(faculty[i].toString());
		}
	}
}
