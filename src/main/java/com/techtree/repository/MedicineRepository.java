package com.techtree.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtree.entity.Health_History;
import com.techtree.entity.Medicine;

public interface MedicineRepository extends JpaRepository<Medicine, Integer>{
 
	List<Medicine> findByHealthHistory(Health_History health);
}
