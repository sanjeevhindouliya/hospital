package com.techtree.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "medicines")
public class Medicine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "medicine_Id")
	private Integer id;

	@Column(name = "medicine_name", length = 500)
	private String medicineName;

	private String duration;

	private int quantity;

	@Column(name = "medicine_charges")
	private double medicineCharges;

	@ManyToOne
	@JoinColumn(name = "health_history_Id", nullable = false)
	private Health_History healthHistory;

	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicine(Integer id, String medicineName, String duration, int quantity, double medicineCharges,
			Health_History healthHistory) {
		super();
		this.id = id;
		this.medicineName = medicineName;
		this.duration = duration;
		this.quantity = quantity;
		this.medicineCharges = medicineCharges;
		this.healthHistory = healthHistory;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getMedicineCharges() {
		return medicineCharges;
	}

	public void setMedicineCharges(double medicineCharges) {
		this.medicineCharges = medicineCharges;
	}

	public Health_History getHealthHistory() {
		return healthHistory;
	}

	public void setHealthHistory(Health_History healthHistory) {
		this.healthHistory = healthHistory;
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", medicineName=" + medicineName + ", duration=" + duration + ", quantity="
				+ quantity + ", medicineCharges=" + medicineCharges + ", healthHistory=" + healthHistory + "]";
	}

	
}
