package com.johnabbott.test.service;

import java.util.List;

import com.johnabbott.test.model.Student;

public interface StudentService {
	public boolean addStudent(Student std);
	
	public List<Student> getStudents(); // Read
	
	public Student getStudentById(int studentId); // Read
	
	public boolean deleteStudent(int studentId); //DELETE
	
	public boolean updateStudent(Student std); // UPDATE
}
