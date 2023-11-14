package com.techtree.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Role {
	@Id
	private Integer id;
	
	private String name;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	

}
