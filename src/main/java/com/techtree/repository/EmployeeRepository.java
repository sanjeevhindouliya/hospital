package com.techtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techtree.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
