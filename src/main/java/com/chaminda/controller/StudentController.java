package com.chaminda.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chaminda.model.Student;
import com.chaminda.service.StudentService;

@Controller
public class StudentController {

	private static final String INDEX_PAGE = "index";
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getWelcomePage(){
		return INDEX_PAGE;
	}
	
	@RequestMapping(value = "/rest/getAllStudents", method = RequestMethod.GET)
	public @ResponseBody List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();
		Student student = new Student();
		student.setFirstName("Chaminda");
		student.setLastName("Ariyaratna");
		student.setEmail("chaminda204@yahoo.com");
		student.setId(1);
		students.add(student);
		
		Student ari = new Student();
		ari.setFirstName("Ranga");
		ari.setLastName("Ariyaratna");
		ari.setEmail("rangs@yahoo.com");
		ari.setId(2);
		students.add(ari);
		
		Student viji = new Student();
		viji.setFirstName("Viji");
		viji.setLastName("Epa");
		viji.setEmail("epa@yahoo.com");
		viji.setId(3);
		students.add(viji);
		return students;
	}

	@RequestMapping(value = "/rest/student/{studentId}", method = RequestMethod.GET)
	public @ResponseBody Student getStudentById(@PathVariable("studentId") Integer studentId) {
		Student student = new Student();
		student.setFirstName("Chaminda");
		student.setLastName("Ariyaratna");
		student.setEmail("chaminda204@yahoo.com");
		student.setNotes("This is my note");
		student.setId(1);
		return student;
	}
	  @RequestMapping(value = "/rest/createStudent", method = RequestMethod.POST)
	    public @ResponseBody Student createEmployee(@RequestBody Student student) {
		  Student savedStudent = studentService.saveStudent(student);
		  
	        return savedStudent;
	    }
	     
	  
	@RequestMapping(value = "/rest/deleteStudent", method = RequestMethod.DELETE)
    public @ResponseBody Boolean deleteStudent(@PathVariable("studentId") Integer studentId) {
		// Call the service and delete
        return true;
    }

}
