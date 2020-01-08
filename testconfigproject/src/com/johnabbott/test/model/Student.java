package com.johnabbott.test.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private boolean partTime;
	private String gender;
	
	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public boolean isPartTime() {
		return partTime;
	}

	public void setPartTime(boolean partTime) {
		this.partTime = partTime;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
}
