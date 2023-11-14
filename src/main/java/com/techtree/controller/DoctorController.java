package com.techtree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techtree.binding.DoctorDto;
import com.techtree.entity.Doctor;
import com.techtree.entity.Employee;
import com.techtree.service.DoctorService;

@RestController
@RequestMapping("/api")
public class DoctorController {

	
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/doctor")
	public ResponseEntity<Doctor> createDoctorN(@RequestBody Doctor emp) {
		Doctor createDoctorN = doctorService.createDoctor(emp);
		return new ResponseEntity<Doctor>(createDoctorN, HttpStatus.CREATED);
	}
	
	 @GetMapping("/doctors")
	    public ResponseEntity<List<Doctor>> getAllEmployees() {
	         List<Doctor> doctor = doctorService.getDoctor();
	        return new ResponseEntity<>(doctor, HttpStatus.CREATED);
	        }
	 
}
