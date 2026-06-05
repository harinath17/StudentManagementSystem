package com.sms;
import java.util.ArrayList;
public class StudentService {
	
		ArrayList<Student> students=new ArrayList<>();
		
		 public void addStudent(Student student)
		{ 
			 
			for(Student s:students)
		 {
				 if(s.getrollNo()==student.getrollNo())
				 {
					 System.out.println("Student Id ALREADY EXISTS");
				 }
		 }
		 students.add(student);
		 System.out.println("Successfully added the elements");
		}
		 public void  viewStudent()
		 {
			 if(students.isEmpty())
			 {
				 System.out.println("No student found.");
				 return;
			 }
			 for(Student student:students)
			 {
				 System.out.println(student);
			 }
		 }
        public void searchStudent(int rollNo)
        
        {
        	for(Student student:students)
        	{
        		if(student.getrollNo()== rollNo)
        		{
        			System.out.println(student);
        			return;
        		}
        	}
        	System.out.println("student not found");
        }
        public void deleteStudent(int rollno)
        {
        	for(Student student:students)
        	{
        		if(student.getrollNo()==rollno)
        		{
        			students.remove(student);
        			System.out.println("successfully removed values");
        			return ;
        		}
        		System.out.println("student not found");
        		
        	}
        }
        public void updateMarks(int rollno1,double newMarks)
        {
        	for(Student student:students)
        	{
        		if(student.getrollNo()==rollno1)
        		{
        			student.setMarks(newMarks);
        			System.out.println("successfully updated successfully");
        			return ;
        		}
        	}
        	System.out.println("student not found");
        }
}
