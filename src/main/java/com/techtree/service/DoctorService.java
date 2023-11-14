package com.techtree.service;

import java.util.List;

import com.techtree.binding.DoctorDto;
import com.techtree.binding.EmployeeDto;
import com.techtree.entity.Doctor;
import com.techtree.entity.Employee;

public interface DoctorService {
	
	        //create doctor
			public Doctor createDoctor(Doctor doctor);
			
			public Doctor getByDoctorId(Integer id);
			
			public void deleteDoctor(Integer id);

			// get All
			public List<Doctor> getDoctor();

}
