package StudentManagementSys;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int costOfCourse = 600;
	private int tuitionBalance = 0;
	private static int id = 1000;
	
	//prompt user to enter student's name and year
	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student firstname: ");
		this.firstName = sc.nextLine();
		System.out.println("Enter student lastname: ");
		this.lastName = sc.nextLine();
		System.out.println("1. Freshmen\n2. Sophmore\n3. Junior\n4. Senior\nEnter student class level: ");
		this.gradeYear = sc.nextInt();
		
	}
	//generate ID
	public void setStudentID() {
		id++;
		this.studentID = gradeYear + "" + id;
	}
	//show Student
	public void showStudent() {	
		System.out.println(this.firstName+"-"+this.lastName+"-"+this.gradeYear+"-"+this.studentID);
	}
	//Enroll in courses
	public void enroll() {
		do {
			System.out.println("Enter course to enroll, q to quit: ");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
				if(!course.equals("q")) {
					courses = courses + "\n - " + course;
					tuitionBalance += costOfCourse; //tuitionBalance = tuitionBalance + coseOfCourse
				} else {
					System.out.println("-----");
					break;
					
			}
		}while(true);
			System.out.println("Enrolled in: "+ courses);
			System.out.println("Tuition Balance: $"+ tuitionBalance);
	
	}
	//view balance
	public void viewBalance() {
		System.out.println("Your balance is: $"+tuitionBalance );
	}
	// pay tuition
	public void payTuition() {
		System.out.print("Enter your payment: $");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("You payed $" + payment);
		viewBalance();
	}
	//show status
	public String showInfo() {
		return "Full Name: " + firstName + " " + lastName + "\nStudent ID: "+ studentID +"\nCourses Enrolled: " + courses + "\nBalance: $" + tuitionBalance;
	}
	
	
}
