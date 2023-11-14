package com.techtree.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private String name;

	private String qualificaton;

	private double salary;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "hire_date")
	private LocalDate hiredate;

	@Column(columnDefinition = "boolean default false")
	private boolean status;

	@OneToOne()
	@JoinColumn(name = "user_Id", nullable = false)
	private User user;

	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Doctor doctor;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String qualificaton, double salary, LocalDate hiredate, boolean status, User user,
			Doctor doctor) {
		super();
		this.id = id;
		this.qualificaton = qualificaton;
		this.salary = salary;
		this.hiredate = hiredate;
		this.status = status;
		this.user = user;
		this.doctor = doctor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQualificaton() {
		return qualificaton;
	}

	public void setQualificaton(String qualificaton) {
		this.qualificaton = qualificaton;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", qualificaton=" + qualificaton + ", salary=" + salary + ", hiredate=" + hiredate
				+ ", status=" + status + ", user=" + user + ", doctor=" + doctor + "]";
	}
	
	

}
