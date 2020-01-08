package com.johnabbott.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.johnabbott.test.model.Student;
import com.johnabbott.test.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping("/testmethod")
	public ModelAndView getName() {
		ModelAndView mv = new ModelAndView("test-jsp");
		mv.addObject("obj", "reza");

		return mv;
	}

	@RequestMapping(value = "/getstudents", method = RequestMethod.GET)
	public ModelAndView getStudentsList() {
		ModelAndView modelView = new ModelAndView("student-list");

		List<Student> students = service.getStudents();
		modelView.addObject("studList", students);
		modelView.addObject("student", new Student());
		
		return modelView;
	}
	
	//..../testconfigproject/students/student/Alex
	//Alex would be passed via path variable
	@RequestMapping(value = "/student/{name}", method = RequestMethod.GET)
	public ModelAndView getStudent(@PathVariable("name") String studentName) {
		ModelAndView modelView = new ModelAndView("student");
		modelView.addObject("studentName", studentName);
		
		return modelView;
	}
	
	
	@RequestMapping(value = "saveStudent", method= RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student") Student std) {
		if(service.addStudent(std))
			return "redirect:/students/getstudents";
		else {
			return "ErrorPage";
		}
	}
	
	@RequestMapping(value = "deletestudent")
	public String deleteStudent(@RequestParam("studentId") int studentId) {
		return "";
	}
	
	@RequestMapping(value = "updatestudent")
	public String updateStudent(@RequestParam("studentId") int studentId) {
//		if(service.addStudent(std))
//			return "redirect:/students/getstudents";
//		else {
//			return "ErrorPage";
//		}
		return "";
	}
	
}
