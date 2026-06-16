package com.sms;
import java.io.EOFException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentService {
	
		
		 public void addStudent(Student student)
		{ 
			 
			String sql="insert into student values(?,?,?)";
			try (
				Connection con=DBConnection.getConnection();
				PreparedStatement ps=con.prepareStatement(sql);
				)
			{
				ps.setInt(1,student.getrollNo());
				ps.setString(2,student.getName());
				ps.setDouble(3,student.getMarks());
				int rows=ps.executeUpdate();
				if(rows>0)
				{
					System.out.println("Student Added Successfully");
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		 
		public void  viewStudent()
		 {
			String sql="select * from student";
			try(
					Connection con=DBConnection.getConnection();
					PreparedStatement ps=con.prepareStatement(sql);
					ResultSet rs=ps.executeQuery(sql);
					)
			{
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		 }
        public void searchStudent(int rollNo)
        
        {
        	String sql="select * from student where rollno=?";
        	try(
					Connection con=DBConnection.getConnection();
					PreparedStatement ps=con.prepareStatement(sql);
					)
        	{
        	
        		ps.setInt(1,rollNo);
        		
        		ResultSet rs=ps.executeQuery();
        		if(rs.next())
        		{
        			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
        		}
        		else
        		{
        			System.out.println("student not found");
        		}
        		
        	}
        	catch(Exception e)
        	{
        		e.printStackTrace();
        	}
        	
        }
        public void deleteStudent(int rollno)
        {
        	String sql ="delete from student where rollno=?";
        	try(
					Connection con=DBConnection.getConnection();
					PreparedStatement ps=con.prepareStatement(sql);
					)
        	{
        		ps.setInt(1, rollno);
        		int rows=ps.executeUpdate();
        		if(rows>0)
        		{
        			System.out.println("student deleted");
        		}
        		else
        		{
        			System.out.println("student not found");
        		}
        	}
        	catch(Exception e)
        	{
        		e.printStackTrace();
        	}
        	
        	
        }
        public void updateMarks(int rollno1,double newMarks)
        {
        	String sql="update student set marks=? where rollno=?";
        	try(
					Connection con=DBConnection.getConnection();
					PreparedStatement ps=con.prepareStatement(sql);
					)
        	{
        		ps.setDouble(1,newMarks);
        		ps.setInt(2,rollno1);
        		int rows=ps.executeUpdate();
        		if(rows>0)
        		{
        		System.out.println(rows+"succesfully");
        		}
        		else
        		{
        			System.out.println("student not found");
        		}
        	}
        	catch(Exception e)
        	{
        		e.printStackTrace();
        	}
        	
        	
        }
}
