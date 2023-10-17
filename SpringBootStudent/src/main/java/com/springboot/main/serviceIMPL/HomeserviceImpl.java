package com.springboot.main.serviceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.main.model.Student;
import com.springboot.main.repository.HomeRepository;
import com.springboot.main.serviceI.HomeserviceI;

@Service
public class HomeserviceImpl implements HomeserviceI {

	@Autowired
	HomeRepository hr;
	
	@Override
	public Student savestu(Student s) {
	
		return hr.save(s);
		
	}

	@Override
	public List<Student> getstudents() {
		
		return hr.findAll();
	}

	@Override
	public Student putstudents(Student s) {
		
		return hr.save(s);
	}

	@Override
	public Student patchAge(String sage,int sid) {
		
		Student s=hr.findAllBySid(sid);
		System.out.println(s.getSage());
		s.setSage(sage);
		return hr.save(s);
		
		
		
	}

}
