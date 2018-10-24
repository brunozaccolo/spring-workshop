package com.workshop.springboot.model;


import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	
	@NotBlank
	private String name;
	
	private String lastName;
	
	@NotBlank
	private String cpf;
	
	
	private Address address;


	public Address getAddress() {
		return address;
	}


	public String getCpf() {
		return cpf;
	}


	public String getId() {
		return id;
	}


	public String getLastName() {
		return lastName;
	}


	public String getName() {
		return name;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
