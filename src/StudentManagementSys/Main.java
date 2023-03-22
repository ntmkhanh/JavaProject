package StudentManagementSys;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Student stu = new Student();
//		stu.setStudentID();
//		//stu.showStudent();
//		stu.enroll();
//		stu.payTuition();
//		System.out.println(stu.showInfo());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number student: ");
		int numOfStudent = sc.nextInt();
		Student[] student = new Student[numOfStudent];
		
		for(int i=0; i<numOfStudent; i++) {
			student[i]= new Student();
			student[i].setStudentID();
			student[i].enroll();
			student[i].payTuition();
			System.out.println(student[i].showInfo());
		}
	}

}
