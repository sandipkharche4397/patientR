package com.springboot.main.serviceI;

import java.util.List;

import com.springboot.main.model.Student;

public interface HomeserviceI {

	Student savestu(Student s);

	List<Student> getstudents();

	Student putstudents(Student s);

	Student patchAge(String sage,int sid);

}
