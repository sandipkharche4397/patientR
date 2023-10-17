package com.hospitalManagemnetSystem.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalManagemnetSystem.main.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{

	
	  public Patient findAllByFirstnameAndMobno(String firstname,long mobno);
}
