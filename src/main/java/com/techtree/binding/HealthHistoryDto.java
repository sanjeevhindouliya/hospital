package com.techtree.binding;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class HealthHistoryDto {
	
	private int id;

	private String diseases;

	private LocalDate appointmentDate;

	private LocalTime appointmentTime;

	private Boolean paymentStatus;

	private String allocatedBed;

	private double paidAmount;

	
	private String symptoms;

	private LocalDate admitDate;

	private String prescriptionInstruction;

	private LocalDate dischargeDate;

	private LocalDate paymentDate;

	@JsonIgnoreProperties(value = "health_history")
	private PatientDto patient;

	@JsonIgnoreProperties(value = "healthHistory")
	private List<MedicineDto> medicines = new ArrayList<>();

}
