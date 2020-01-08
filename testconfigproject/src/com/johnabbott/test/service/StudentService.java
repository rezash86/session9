package com.johnabbott.test.service;

import java.util.List;

import com.johnabbott.test.model.Student;

public interface StudentService {
	public List<Student> getStudents();
	
	public boolean addStudent(Student std);
}
