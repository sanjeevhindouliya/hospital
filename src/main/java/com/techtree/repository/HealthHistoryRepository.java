package com.techtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtree.entity.Health_History;

public interface HealthHistoryRepository extends JpaRepository<Health_History, Integer> {

}
