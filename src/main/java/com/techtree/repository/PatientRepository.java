package com.techtree.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtree.entity.Doctor;
import com.techtree.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

	List<Patient> findByDoctor(Doctor doctor);
}
