package com.workshop.springboot.model;

public class Address {

	private String street;
	
	private String number;
	
	private String compl;
	
	private String city;
	
	private String state;
	
	private String zip;
	
	public String getCity() {
		return city;
	}
	public String getCompl() {
		return compl;
	}
	public String getNumber() {
		return number;
	}
	public String getState() {
		return state;
	}
	public String getStreet() {
		return street;
	}
	public String getZip() {
		return zip;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setCompl(String compl) {
		this.compl = compl;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
}
