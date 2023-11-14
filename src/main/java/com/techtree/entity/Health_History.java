package com.techtree.entity;

import java.time.LocalDate;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "health_history")
public class Health_History {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "health_history_Id")
	private Integer id;

	@Column(length = 300)
	private String diseases;

	@Column(name = "appointment_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate appointmentDate;

	@Column(name = "symptoms", length = 100)
	private String symptoms;

	@Column(name = "paid_amount")
	private double paidAmount;

	@Column(name = "appointment_time")
	@JsonFormat(pattern = "HH:mm:ss")
	private LocalTime appointmentTime;

	@Column(name = "admit_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate admitDate;

	@Column(name = "payment_status", columnDefinition = "boolean default false")
	private Boolean paymentStatus;

	@Column(name = "allocated_bed", length = 45)
	private String allocatedBed;

	@Column(name = "prescription_instruction", length = 1000)
	private String prescriptionInstruction;

	@Column(name = "discharge_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate dischargeDate;

	@CreationTimestamp
	@Column(name = "payment_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private LocalDate paymentDate;

	@ManyToOne(fetch = FetchType.EAGER , cascade = CascadeType.ALL)
	@JoinColumn(name = "patient_Id", nullable = false)
	private Patient patient;

	@OneToMany(mappedBy = "healthHistory", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Medicine> medicines = new ArrayList<>();

	public Health_History() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Health_History(Integer id, String diseases, LocalDate appointmentDate, String symptoms, double paidAmount,
			LocalTime appointmentTime, LocalDate admitDate, Boolean paymentStatus, String allocatedBed,
			String prescriptionInstruction, LocalDate dischargeDate, LocalDate paymentDate, Patient patient,
			List<Medicine> medicines) {
		super();
		this.id = id;
		this.diseases = diseases;
		this.appointmentDate = appointmentDate;
		this.symptoms = symptoms;
		this.paidAmount = paidAmount;
		this.appointmentTime = appointmentTime;
		this.admitDate = admitDate;
		this.paymentStatus = paymentStatus;
		this.allocatedBed = allocatedBed;
		this.prescriptionInstruction = prescriptionInstruction;
		this.dischargeDate = dischargeDate;
		this.paymentDate = paymentDate;
		this.patient = patient;
		this.medicines = medicines;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDiseases() {
		return diseases;
	}

	public void setDiseases(String diseases) {
		this.diseases = diseases;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public LocalTime getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(LocalTime appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public LocalDate getAdmitDate() {
		return admitDate;
	}

	public void setAdmitDate(LocalDate admitDate) {
		this.admitDate = admitDate;
	}

	public Boolean getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(Boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getAllocatedBed() {
		return allocatedBed;
	}

	public void setAllocatedBed(String allocatedBed) {
		this.allocatedBed = allocatedBed;
	}

	public String getPrescriptionInstruction() {
		return prescriptionInstruction;
	}

	public void setPrescriptionInstruction(String prescriptionInstruction) {
		this.prescriptionInstruction = prescriptionInstruction;
	}

	public LocalDate getDischargeDate() {
		return dischargeDate;
	}

	public void setDischargeDate(LocalDate dischargeDate) {
		this.dischargeDate = dischargeDate;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public List<Medicine> getMedicines() {
		return medicines;
	}

	public void setMedicines(List<Medicine> medicines) {
		this.medicines = medicines;
	}

	@Override
	public String toString() {
		return "Health_History [id=" + id + ", diseases=" + diseases + ", appointmentDate=" + appointmentDate
				+ ", symptoms=" + symptoms + ", paidAmount=" + paidAmount + ", appointmentTime=" + appointmentTime
				+ ", admitDate=" + admitDate + ", paymentStatus=" + paymentStatus + ", allocatedBed=" + allocatedBed
				+ ", prescriptionInstruction=" + prescriptionInstruction + ", dischargeDate=" + dischargeDate
				+ ", paymentDate=" + paymentDate + ", patient=" + patient + ", medicines=" + medicines + "]";
	}

	
	
}
