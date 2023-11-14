package com.techtree.service;

import java.util.List;

import com.techtree.binding.EmployeeDto;
import com.techtree.entity.Employee;

public interface EmployeeService {

	// create
	public	Employee createEmployee(Employee emp);
	
	public Employee createAdmin(Employee emp);

	// get
	public Employee getEmployee(Integer Id);
	
	// get all Employees
    public List<Employee> getAllEmployees();

	// delete
	public void deleteEmployee(Integer Id);
		
}
