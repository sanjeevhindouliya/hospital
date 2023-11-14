package com.techtree.service;

import java.util.List;

import com.techtree.binding.PatientDto;
import com.techtree.entity.Patient;

public interface PatientService {

	
	// create patient ( Sign Up )
		public Patient createPatient(Patient patient);
		
		// update patient Doctor
		public Patient updatePatient(Patient patient);
		
		public List<Patient> getAllPatient();
		
		public void deletePatient(Integer patientId);
		
		public Patient getById(Integer patientId);
}
