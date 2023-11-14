package com.techtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtree.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

}
