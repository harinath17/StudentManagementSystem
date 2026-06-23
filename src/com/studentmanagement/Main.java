package com.studentmanagement;
import java.util.Scanner.*;
import java.util.*;

public class Main {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		StudentService service=new StudentService();
		while(true)
		{
			System.out.println("Student Management system:");
			System.out.println("1-add values");
			System.out.println("2-view values");
			System.out.println("3-search values");
			System.out.println("4-delete values");
			System.out.println("5-update values");
			System.out.println("6-search by student name");
			System.out.println("7-countStudents");
			System.out.println("8-Average marks");
			System.out.println("9-highest marks");
			System.out.println("10-marks in desc order");
			System.out.println("11-Exit");
			System.out.println("entre choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter ID:");
				int rollNo=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name:");
				String name=sc.nextLine();
				System.out.println("Enter Marks :");
				double Marks=sc.nextDouble();
				sc.nextLine();
				service.addStudent(new Student(rollNo,name,Marks));
				break;
			case 2:
				service.viewStudent();
				break;
			case 3:
				System.out.println("Enter id to search:");
				int searchrollno=sc.nextInt();
				sc.nextLine();
				service.searchStudent(searchrollno);
				break;
			case 4:
				System.out.println("Enter id to delete");
				int deleterollno=sc.nextInt();
				sc.nextLine();
				service.deleteStudent(deleterollno);
				break;
			case 5:
				System.out.println("Enter id:");
				int updaterollno=sc.nextInt();
				System.out.println("Enter new marks:");
				double newMarks=sc.nextDouble();
				sc.nextLine();
				service.updateMarks(updaterollno, newMarks);
				break;
			case 6:
				System.out.println("Enter name:");
				String sname=sc.nextLine();
				service.searchStudentByName(sname);
				break;
			case 7:
				service.countStudents();
				break;
			case 8:
				service.averageStudents();
				sc.nextLine();
				break;
			case 9:
				service.highestmarks();
				break;
			case 10:
				service.marksinorder();
				break;
			case 11:
				System.out.println("Exitsing....");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}

}
