package com.techtree.serviceImp;

import java.util.List;
import java.util.Optional;

import javax.management.relation.Role;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techtree.binding.AddressDto;
import com.techtree.binding.EmployeeDto;
import com.techtree.binding.UserDto;
import com.techtree.entity.Address;
import com.techtree.entity.Employee;
import com.techtree.repository.AddressRepository;
import com.techtree.repository.EmployeeRepository;
import com.techtree.repository.RoleRepository;
import com.techtree.repository.UserRepository;
import com.techtree.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {
   
	@Autowired
	private EmployeeRepository employeeRepo;

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private RoleRepository roleRepo;

	@Autowired
	private AddressRepository addressRepo;


	@Override
	public Employee createEmployee(Employee emp) {
		
		return employeeRepo.save(emp);
		
		
	}

	@Override
	public Employee createAdmin(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Employee getEmployee(Integer Id) {
		
		 Optional<Employee> findById = employeeRepo.findById(Id);
		 if(findById.isPresent()) {
			return  findById.get();
		 }
		 return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepo.findAll();
	}

	@Override
	public void deleteEmployee(Integer Id) {
		Employee emp = this.employeeRepo.findById(Id)
				.orElse(null);

		User user = (User) emp.getUser();
		((List<Employee>) user.getRoles()).clear();
		this.userRepo.delete((com.techtree.entity.User) user);
		
	}
	
	

}
