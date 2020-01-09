package com.johnabbott.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.johnabbott.test.dao.StudentDao;
import com.johnabbott.test.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	List<Student> listStudents;
	
	public StudentServiceImpl() {
		listStudents = new ArrayList<Student>();
		
		listStudents.add(new Student(1, "toto1", "popo1", 15));
		listStudents.add(new Student(2, "toto2", "popo2", 14));
		listStudents.add(new Student(3, "toto3", "popo3", 24));
		listStudents.add(new Student(4, "toto4", "popo4", 34));
	}
	
	public List<Student> getStudents(){
		return studentDao.getStudents();
	}

	@Override
	public boolean addStudent(Student std) {
		return studentDao.insertStudent(std) > 0 ;
	}

	@Override
	public Student getStudentById(int studentId) {
		return studentDao.getStudentById(studentId);
	}

	@Override
	public boolean deleteStudent(int studentId) {
		return studentDao.deleteStudent(studentId);
	}

	@Override
	public boolean updateStudent(Student std) {
		return studentDao.updateStudent(std);
	}
}
