package com.techtree.binding;

import java.time.LocalDate;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.techtree.entity.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonInclude(value = Include.NON_NULL)
public class UserDto {

	private int id;
	
	private String firstName;

	private String lastName;

	private String gender;

	@JsonInclude(value = Include.NON_NULL)
	private Set<Role> roles;

	private String mobileNo;

	private String bloodGroup;

	private LocalDate dob;

	private AddressDto address;

	@JsonIgnoreProperties(value = "user")
	private PatientDto patient;

	@JsonIgnoreProperties(value = "user")
	private EmployeeDto employee;
}
