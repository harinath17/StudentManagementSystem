package com.sms;
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
			System.out.println("6-Exit");
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
				service.addStudent(new Student(rollNo,name,Marks));
				break;
			case 2:
				service.viewStudent();
				break;
			case 3:
				System.out.println("Enter id to search:");
				int rollno=sc.nextInt();
				service.searchStudent(rollno);
				break;
			case 4:
				System.out.println("Enter id to delete");
				int rollno1=sc.nextInt();
				service.deleteStudent(rollno1);
				break;
			case 5:
				System.out.println("Enter id:");
				int rollno11=sc.nextInt();
				System.out.println("Enter new marks:");
				double newMarks=sc.nextDouble();
				service.updateMarks(rollno11, newMarks);
				break;
			case 6:
				System.out.println("Exitsing....");
				sc.close();
				return;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}

}
