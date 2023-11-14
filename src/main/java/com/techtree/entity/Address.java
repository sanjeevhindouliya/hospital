package com.techtree.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_Id")
	private Integer id;

	@Column(name = "plot_no", length = 45)
	private String plotNo;

	@Column(name = "building_name", length = 45)
	private String buildingName;

	@Column(name = "area_name", length = 45)
	private String areaName;

	@Column(length = 45)
	private String city;

	@Column(length = 45)
	private String state;

	@Column(length = 45)
	private String country;

	@Column(length = 20)
	private int pincode;

	@OneToOne()
	@JoinColumn(name = "user_Id")
	private User user;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String plotNo, String buildingName, String areaName, String city, String state,
			String country, int pincode, User user) {
		super();
		this.id = id;
		this.plotNo = plotNo;
		this.buildingName = buildingName;
		this.areaName = areaName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(String plotNo) {
		this.plotNo = plotNo;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", plotNo=" + plotNo + ", buildingName=" + buildingName + ", areaName=" + areaName
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + ", user="
				+ user + "]";
	}

	
	
}
