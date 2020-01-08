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
		return listStudents;
	}

	@Override
	public boolean addStudent(Student std) {
//		if(studentDao.insertStudent(std) > 0) {
//			return true;
//		}
//		return false;
		return studentDao.insertStudent(std) > 0 ;
	}
}
