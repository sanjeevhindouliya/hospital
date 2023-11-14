package com.techtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.techtree.entity.Patient;
import com.techtree.service.PatientService;



@RestController
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	 @PostMapping("/addPatient")
	    public ResponseEntity<Patient> savePatient(@RequestBody Patient patient) {
		 Patient createPatient = patientService.createPatient(patient);
	        return new ResponseEntity<>(createPatient, HttpStatus.OK);
	 }
	 
	 @PutMapping("/patient/{patientId}")
	    public ResponseEntity<Patient> updatePatient(@PathVariable Integer patientId,  @RequestBody Patient patient) {
	    	patient.setId(patientId);
	    	Patient updatePatient = patientService.updatePatient(patient);
	        return new ResponseEntity<>(updatePatient, HttpStatus.OK);
	    }
	 
	 @DeleteMapping("/patient/{patientId}")
	    public ResponseEntity<String> deletePatient(@PathVariable Integer patientId) {
		 patientService.deletePatient(patientId);
	        return new ResponseEntity<>("Employee with ID :" + patientId + " deleted successfully", HttpStatus.OK);
	    }

	  @GetMapping("/patient")
	    public ResponseEntity<List<Patient>> getAllPatient() {
		  List<Patient> allPatient = patientService.getAllPatient();
	        return new ResponseEntity<>(allPatient, HttpStatus.CREATED);
	    }
}
