package com.springboot.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.main.model.Student;
import com.springboot.main.serviceI.HomeserviceI;

@RestController
public class HomeController {
	
	@Autowired
	HomeserviceI si;

	@PostMapping(value = "/save")
	public ResponseEntity<Student> savestudent(@RequestBody Student s)
	{
		Student ss=si.savestu(s);
		return new ResponseEntity<Student>(si.savestu(s),HttpStatus.OK);
	}
	
	@GetMapping(value = "/get")
	public ResponseEntity<List<Student>> getstudent()
	{
		List<Student> st=si.getstudents();
		return new ResponseEntity<List<Student>>(st,HttpStatus.OK);
	}
	
	@PutMapping(value = "/put")
	public ResponseEntity<Student> putstudent(@RequestBody Student s)
	{
		Student ss=si.putstudents(s);
		return new ResponseEntity<Student>(ss,HttpStatus.OK);
	}
	
	@PutMapping(value = "/patch/{sage}/{sid}")
	public ResponseEntity<Student> patchAge(@PathVariable String sage,@PathVariable int sid)
	{
		Student ss=si.patchAge(sage,sid);
		return new ResponseEntity<Student>(ss,HttpStatus.OK);
	}
	
}
