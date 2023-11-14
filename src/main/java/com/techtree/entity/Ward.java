package com.techtree.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ward")
public class Ward {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ward_Id")
	private Integer id;

	@Column(name = "ward_type", length = 45)
	private String wardType;

	@Column(name = "ward_charges")
	private double wardCharges;

	@OneToMany(mappedBy = "ward", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Patient> patients = new HashSet<>();

	public Ward() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ward(int id, String wardType, double wardCharges, Set<Patient> patients) {
		super();
		this.id = id;
		this.wardType = wardType;
		this.wardCharges = wardCharges;
		this.patients = patients;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWardType() {
		return wardType;
	}

	public void setWardType(String wardType) {
		this.wardType = wardType;
	}

	public double getWardCharges() {
		return wardCharges;
	}

	public void setWardCharges(double wardCharges) {
		this.wardCharges = wardCharges;
	}

	public Set<Patient> getPatients() {
		return patients;
	}

	public void setPatients(Set<Patient> patients) {
		this.patients = patients;
	}

	
	
}
