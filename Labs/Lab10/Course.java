package lab10;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Course {
	
	public final int SIZE = 10;
	private String name;
	private String instructor;
	private ArrayList<String> students = new ArrayList<String>();
	private int numberOfStudents;
	
	
	public Course(String name, String instructor) {
		this.name = name;
		this.instructor = instructor;
		this.numberOfStudents = 0;
	}
	
	public void addStudent(String studentName) {
		
		if(numberOfStudents < SIZE && studentName != null && studentName.length() > 0) {
			students.add(studentName);
			numberOfStudents++;
		}
	}
	
	
	public ArrayList<String> getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return this.numberOfStudents;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getInstructor() {
		return this.instructor;
	}
	
	public void listOfStudents(){
		System.out.println("List of students: ");
		
		//enhanced for loop to display student names
		for(String s : students) {
			System.out.println("\t\t " + s);			
		}
	}
	
	public String toString() {
		String courseInfo = "Course: " + this.name + "\nInstructor: " + this.instructor + 
				"\nNumber of registered students: " + getNumberOfStudents();
		return courseInfo;
	}
	
	public static void main(String[] args) {
		Course c1 = new Course("Programming Fundamentals", " zak");
		c1.addStudent("John");
		c1.addStudent("Smith");
		c1.addStudent("Sam");
		
		System.out.println(c1.toString());
		c1.listOfStudents();
		
		Course c2 = new Course("Data Structures and Algorithms", " Bob");
		c2.addStudent("Tom");
		c2.addStudent("Taylor");
		
		System.out.println(c2.toString());
		c2.listOfStudents();
		
	
	}
}
