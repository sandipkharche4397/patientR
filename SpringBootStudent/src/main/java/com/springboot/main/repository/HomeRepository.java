package com.springboot.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.main.model.Student;

@Repository
public interface HomeRepository extends JpaRepository<Student, Integer>{

	public Student findAllBySid(int sid);

}
