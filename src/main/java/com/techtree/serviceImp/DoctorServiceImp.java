package com.techtree.serviceImp;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.techtree.binding.DoctorDto;
import com.techtree.binding.EmployeeDto;
import com.techtree.entity.Doctor;
import com.techtree.entity.Employee;
import com.techtree.repository.DoctorRepository;
import com.techtree.service.DoctorService;

@Service
public class DoctorServiceImp implements DoctorService{

	
	private DoctorRepository doctorRepo;
	
	
	@Override
	public List<Doctor> getDoctor() {
		return doctorRepo.findAll();	
	}


	@Override
	public Doctor createDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
		
	}

	@Override
	public Doctor getByDoctorId(Integer id) {
		Optional<Doctor> findById = doctorRepo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}


	@Override
	public void deleteDoctor(Integer id) {
		
		 doctorRepo.deleteById(id);
	}
	
	

}
