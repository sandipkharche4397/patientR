package com.hospitalManagemnetSystem.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalManagemnetSystem.main.model.Patient;
import com.hospitalManagemnetSystem.main.repository.PatientRepository;
import com.hospitalManagemnetSystem.main.serviceI.PatientServiceI;

@Service
public class PatientService implements PatientServiceI {

	@Autowired
	PatientRepository pr;

	@Override
	public Patient savepatient(Patient p) {
		return pr.save(p);
		}
	@Override
	public Patient getDetailsOne(String firstname,long mobno){
		Patient getOnePatient = pr.findAllByFirstnameAndMobno(firstname,mobno);
		return getOnePatient;
	}
	@Override
	public Patient updatepatient(Patient p) {
		
	
		
		return pr.save(p);
	}

	
	
}
