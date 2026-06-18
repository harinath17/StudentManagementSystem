package com.studentmanagement;
import java.util.*;
public class Student {
	   private int rollno;
	   private String name;
	   private Double marks;
    	Student(int rollno,String name,Double marks)
		{
			this.rollno=rollno;
			this.name=name;
			this.marks=marks;
		}
    	public void setRollNo(int rollno)
    	{
    		this.rollno=rollno;
    	}
    	public int getrollNo()
    	{
    		return rollno;
    	}
    	public void setName(String name)
    	{
    		this.name=name;
    	}
    	public void setMarks(Double marks)
    	{
    		this.marks=marks;
    	}
    	public String getName()
    	{
    		return name;
    	}
    	public double getMarks()
    	{
    		return marks;
    	}
    	public String toString()//when java prints an object's,it calls the object tostring() mehtod 
    	{
    		return "Roll No: "+rollno+", Name : "+name+", Marks : "+marks;
    	}
	   
}
