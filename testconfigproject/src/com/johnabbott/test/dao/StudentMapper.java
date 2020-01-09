package com.johnabbott.test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.johnabbott.test.model.Student;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Student(rs.getInt("id"), rs.getString("firstname"),
				rs.getString("lastname"), rs.getInt("age"));
	}

}
