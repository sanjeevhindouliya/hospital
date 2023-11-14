package com.techtree.entity;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "doctor")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "doctor_Id")
	private Integer id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "doctor_fee", nullable = false, length = 100)
	private double doctorFee;

	@Column(name = "scheduled_start_time")
	@JsonFormat(pattern = "HH:mm:ss")
	private LocalTime startTime;

	@Column(name = "scheduled_end_time")
	@JsonFormat(pattern = "HH:mm:ss")
	private LocalTime endTime;

	private String days;

	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Patient> patients = new ArrayList<>();
     
	@OneToOne(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "employee_id")
	private Employee employee;

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(Integer id, String name, double doctorFee, LocalTime startTime, LocalTime endTime, String days,
			List<Patient> patients, Employee employee) {
		super();
		this.id = id;
		this.name = name;
		this.doctorFee = doctorFee;
		this.startTime = startTime;
		this.endTime = endTime;
		this.days = days;
		this.patients = patients;
		this.employee = employee;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDoctorFee() {
		return doctorFee;
	}

	public void setDoctorFee(double doctorFee) {
		this.doctorFee = doctorFee;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", doctorFee=" + doctorFee + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", days=" + days + ", patients=" + patients + ", employee=" + employee + "]";
	}

   
	

	

}
