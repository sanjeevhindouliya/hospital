package com.techtree.binding;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MedicineDto {
	private int id;

	private String medicineName;

	private String duration;

	private Integer quantity;

	private Double medicineCharges;

	@JsonIgnoreProperties(value = "medicines")
	private HealthHistoryDto healthHistory;

}
