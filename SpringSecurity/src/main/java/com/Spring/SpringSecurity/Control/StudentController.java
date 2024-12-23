package com.Spring.SpringSecurity.Control;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
//import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.SpringSecurity.Model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
	
	
	List<Student> list = new ArrayList<>(List.of(
			new Student(1,"Yash",98),
			new Student(2,"Reddy",99)));
	
	
	@GetMapping("/student")
	public List<Student> getStudents(){
		return list;
	}
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) { // RequestBody is import for POST
		list.add(student);
		return student;
	
	}
	
	@GetMapping("csrf-token")
	public CsrfToken getcsrf(HttpServletRequest httpServletRequest) {
		return (CsrfToken) httpServletRequest.getAttribute("_csrf");
	}
	
	
	// when you want to work on POST,PUT and DELETE you are actually trying to modify data on the website..
	//for this we have to get hold of CSRT token that is generated from logout page
	// Send post request along with CSRF in post man(Headers) to update your entries
	// Key -value can be obtained from method created above
}
