package com.hospitalManagemnetSystem.main.serviceI;

import com.hospitalManagemnetSystem.main.model.Patient;

public interface PatientServiceI {

	Patient savepatient(Patient p);
	Patient getDetailsOne(String firstname, long mobno);
	Patient updatepatient(Patient p);

}
