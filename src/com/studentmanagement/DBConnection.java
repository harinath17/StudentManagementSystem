package com.studentmanagement;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {

	private static final String url="jdbc:mysql://localhost:3306/studentdb";
	private static final String username="root";
	private static final String password="harinath19@";
	public static Connection getConnection()
	{
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			
	       return con;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	
}
