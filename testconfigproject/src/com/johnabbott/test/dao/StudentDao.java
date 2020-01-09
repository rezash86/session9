package com.johnabbott.test.dao;

import java.util.List;

import com.johnabbott.test.model.Student;

public interface StudentDao {
	public int insertStudent(Student std);
	
	public List<Student> getStudents();
}
