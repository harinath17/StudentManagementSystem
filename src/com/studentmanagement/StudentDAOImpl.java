package com.studentmanagement;

import java.sql.Connection;
import java.sql.*;


public class StudentDAOImpl implements StudentDAO
{
	//database logic (sql) 
	//middle layer -3
			public void addStudent(Student student)
			{ 
	 
				String insertsql="insert into student values(?,?,?)";
				String checksql="select * from student where rollno=?";
				try (
						Connection con=DBConnection.getConnection();)
				{		
					PreparedStatement checkps=con.prepareStatement(checksql);
						checkps.setInt(1,student.getrollNo());
						ResultSet rs=checkps.executeQuery();
					if(rs.next())
					{
						System.out.println("student alreday exists");
						return;
					}
					PreparedStatement insertps=con.prepareStatement(insertsql);
					insertps.setInt(1,student.getrollNo());
					insertps.setString(2,student.getName());
					insertps.setDouble(3,student.getMarks());
					int rows=insertps.executeUpdate();
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
						ResultSet rs=ps.executeQuery();
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
						return ;
					}
					else
					{
						System.out.println("student not found");
						return;
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
						return;
					}
					else
					{
						System.out.println("student not found");
						return;
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
				return;
				}
				else
				{
					System.out.println("student not found");
					return;
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public void searchStudentByName(String name)
		{
				String sql="select * from student where name like ?";
				try(Connection con=DBConnection.getConnection();
						PreparedStatement ps=con.prepareStatement(sql);
						)
				{
					ps.setString(1,"%"+name+"%");
					ResultSet rs=ps.executeQuery();
					if(rs.next())
					{
						System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3));
						return ;
					}
					else
					{
						System.out.println("student not found");
						return;
					}
		
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}			
		}
		public void countStudents()
		{
			String sql="select count(*) from student";
			try(Connection con=DBConnection.getConnection();
					PreparedStatement ps=con.prepareStatement(sql);
					ResultSet rs=ps.executeQuery();
					)
			{
				if(rs.next())
				{
					System.out.println("Total Students:"+rs.getInt(1));
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public void averageStudents()
		{
			String sql="Select avg(marks) from student";
			try(Connection con=DBConnection.getConnection();
					PreparedStatement ps=con.prepareStatement(sql);
					ResultSet rs=ps.executeQuery();
					)
			{
				if(rs.next())
				{
					System.out.println("average marks :"+rs.getDouble(1));
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		public void highestmarks()
		{
			String sql="Select * from student order by marks desc limit 1";
			try(Connection con=DBConnection.getConnection();
					PreparedStatement ps=con.prepareStatement(sql);
					ResultSet rs=ps.executeQuery();
					)
			{
				if(rs.next())
				{
					System.out.println(rs.getInt("rollno")+" "+rs.getString("name")+" "+rs.getInt("marks"));
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
		public void marksinorder()
		{
			String sql="Select * from student order by marks desc";
			try(Connection con=DBConnection.getConnection();
					PreparedStatement ps=con.prepareStatement(sql);
					ResultSet rs=ps.executeQuery();
					)
			{
				while(rs.next())
				{
					System.out.println(rs.getInt("rollno")+" "+rs.getString("name")+" "+rs.getDouble("marks"));
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}

}