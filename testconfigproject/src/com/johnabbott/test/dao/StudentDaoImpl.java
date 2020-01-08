package com.johnabbott.test.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.johnabbott.test.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	JdbcTemplate jdbcTemplate;
	
	private final String SQL_INSERT_STUDENT = "insert into "
			+ "student(firstname, lastname, age) values(?, ?, ?)";
	
	public StudentDaoImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public int insertStudent(Student student) {
		return jdbcTemplate.
				update(SQL_INSERT_STUDENT, 
				student.getFirstName(), 
				student.getLastName(), 
				student.getAge());
	}

}