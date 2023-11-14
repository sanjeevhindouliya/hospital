package com.techtree.binding;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor

public class WardDto {
	private Integer id;

	private String wardType;

	private Double wardCharges;

	@JsonIgnoreProperties(value = "ward")
	private Set<PatientDto> patients = new HashSet<>();

}
