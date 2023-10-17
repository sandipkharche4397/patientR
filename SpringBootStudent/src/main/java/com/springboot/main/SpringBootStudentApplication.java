package com.springboot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.main.model.Student;

@SpringBootApplication
public class SpringBootStudentApplication {

	public static void main(String[] args) {
		System.out.println("Student");
		SpringApplication.run(SpringBootStudentApplication.class, args);
		
	}

}
