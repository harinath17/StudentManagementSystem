package com.sms;

public interface StudentDAO {
	//middle layer -2
	/*"Why use DAO Pattern?"

	Answer:

	DAO (Data Access Object) separates database operations from business logic.
	It improves maintainability, readability, reusability, and allows changing
	the database implementation without affecting the service layer.
*/
	void addStudent(Student student);
	
	void viewStudent();
	
	void searchStudent(int rollNo);
	
	void updateMarks(int rollNo,double marks);
	
	void deleteStudent(int rollNo);
	
}
