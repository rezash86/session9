package com.johnabbott.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/home", "/welcome", "/"})
public class TeacherController {
	
	@RequestMapping(value = "/getTechers", method = RequestMethod.GET)
	public String getStudentsList() {
		return "teacher-list";
	}
}
