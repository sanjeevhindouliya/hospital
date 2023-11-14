package com.techtree.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtree.entity.Doctor;
import com.techtree.entity.Patient;
import com.techtree.entity.Ward;
import com.techtree.repository.DoctorRepository;
import com.techtree.repository.PatientRepository;
import com.techtree.repository.WardRepository;
import com.techtree.service.PatientService;

@Service
public class PatientServiceImp implements PatientService {
    @Autowired
	private PatientRepository patientRepo;
    
    @Autowired
    private DoctorRepository doctorRepo;
    
    @Autowired
    private WardRepository wardRepo;
	
	@Override
	public Patient createPatient(Patient patient) {
		
		Doctor doctor = doctorRepo.findById(patient.getDoctor().getId()).orElse(null);
		if(null == doctor) {
			doctor = new Doctor();
		}
		
		doctor.setName(patient.getDoctor().getName());
		doctor.setDoctorFee(patient.getDoctor().getDoctorFee());
		doctor.setStartTime(patient.getDoctor().getStartTime());
		doctor.setEndTime(patient.getDoctor().getEndTime());
		doctor.setDays(patient.getDoctor().getDays());
		
		Ward ward = wardRepo.findById(patient.getWard().getId()).orElse(null);
		if(null == ward) {
			 ward = new Ward();
		}
		ward.setWardCharges(patient.getWard().getWardCharges());
		ward.setWardType(patient.getWard().getWardType());
		
		return patientRepo.save(patient);
	}

	

	@Override
	public void deletePatient(Integer patientId) {
		patientRepo.deleteById(patientId);
		
	}

	@Override
	public Patient getById(Integer patientId) {
		Optional<Patient> findById = patientRepo.findById(patientId);
		
		if(findById.isPresent()) {
			return findById.get();
		}
		
		return null;
	}

	@Override
	public Patient updatePatient(Patient patient) {
		
		return patientRepo.save(patient);
	}



	@Override
	public List<Patient> getAllPatient() {
		
		return patientRepo.findAll();
	}

}
