package com.sms;
import java.io.EOFException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentService {
	//middle layer-1
	//-> validation & business logic 
	
		StudentDAO dao=new StudentDAOImpl();
		 public void addStudent(Student student)
		{ 
			if(student.getName().isBlank())
			{
				System.out.println("name cannot be empty");
				return ;
			}
			if(student.getMarks()<0 || student.getMarks()>100)
			{
				System.out.println("invlaid marks");
				return;
			}
			dao.addStudent(student);
		}
		public void  viewStudent()
		 {
			
			dao.viewStudent();
		 }
        public void searchStudent(int rollNo)
        {
        	dao.searchStudent(rollNo);
        }
        public void deleteStudent(int rollno)
        {
        	dao.deleteStudent(rollno);        	        	
        }
        public void updateMarks(int rollno1,double newMarks)
        {
        	dao.updateMarks(rollno1, newMarks);        	        	
        }
}
