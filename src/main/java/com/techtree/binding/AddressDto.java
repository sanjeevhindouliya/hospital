package com.techtree.binding;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
//@JsonInclude(value = Include.NON_NULL)
public class AddressDto {

	private int id;

	private String plotNo;

	private String buildingName;

	private String areaName;

	private String city;

	private String state;

	private String country;

	private int pincode;

}
