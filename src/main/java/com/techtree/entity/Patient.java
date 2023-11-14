package com.techtree.entity;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "patients")

public class Patient {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patient_Id")
	private Integer id;
	
	@Column(name = "name")
	private String name;

	@Column(name = "admit_status", columnDefinition = "boolean default false")
	private Boolean admitStatus;

	@Column(name = "current_status", columnDefinition = "boolean default false")
	private Boolean currentStatus;

	@OneToOne()
	@JoinColumn(name = "user_Id")
	private User user;

	@ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	@JoinColumn(name = "doctor_Id")
	private Doctor doctor;

	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Health_History> health_history = new ArrayList<>();

	@ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	@JoinColumn(name = "ward_Id")
	private Ward ward;

	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Patient(Integer id, String name, Boolean admitStatus, Boolean currentStatus, User user, Doctor doctor,
			List<Health_History> health_history, Ward ward) {
		super();
		this.id = id;
		this.name = name;
		this.admitStatus = admitStatus;
		this.currentStatus = currentStatus;
		this.user = user;
		this.doctor = doctor;
		this.health_history = health_history;
		this.ward = ward;
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



	public Boolean getAdmitStatus() {
		return admitStatus;
	}



	public void setAdmitStatus(Boolean admitStatus) {
		this.admitStatus = admitStatus;
	}



	public Boolean getCurrentStatus() {
		return currentStatus;
	}



	public void setCurrentStatus(Boolean currentStatus) {
		this.currentStatus = currentStatus;
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



	public List<Health_History> getHealth_history() {
		return health_history;
	}



	public void setHealth_history(List<Health_History> health_history) {
		this.health_history = health_history;
	}



	public Ward getWard() {
		return ward;
	}



	public void setWard(Ward ward) {
		this.ward = ward;
	}



	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", admitStatus=" + admitStatus + ", currentStatus="
				+ currentStatus + ", user=" + user + ", doctor=" + doctor + ", health_history=" + health_history
				+ ", ward=" + ward + "]";
	}

  

	
	
}
