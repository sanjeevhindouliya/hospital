package com.techtree.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techtree.binding.EmployeeDto;
import com.techtree.entity.Employee;
import com.techtree.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@DeleteMapping("/employee/{Id}")
	public ResponseEntity<Employee> deleteEmployee(@PathVariable Integer Id) {
		employeeService.deleteEmployee(Id);
		return new ResponseEntity<Employee>(HttpStatus.OK);
	}
	
	@GetMapping("/employee/{Id}")
	public ResponseEntity<Employee> getEmpoyee(@PathVariable Integer Id) {
		Employee employee = employeeService.getEmployee(Id);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	
	// create admin
		@PostMapping("/employee/admin")
		public ResponseEntity<Employee> createAdmin( @RequestBody Employee emp) {
			Employee createAdmin = employeeService.createAdmin(emp);
			return new ResponseEntity<Employee>(createAdmin, HttpStatus.CREATED);
		}
	
		@PostMapping("/employee/create/{Id}")
		public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp, @PathVariable Integer Id) {
		Employee createEmployee = employeeService.createEmployee(emp);
			return new ResponseEntity<Employee>(createEmployee, HttpStatus.CREATED);
		}
}
