package com.johnabbott.test.dao;

import java.util.List;

import com.johnabbott.test.model.Student;

public interface StudentDao {
	public int insertStudent(Student std); //Create
	
	public List<Student> getStudents(); // Read
	public Student getStudentById(int studentId); // Read
	
	public boolean deleteStudent(int studentId); //DELETE
	
	public boolean updateStudent(Student std); // UPDATE
	
	
}
