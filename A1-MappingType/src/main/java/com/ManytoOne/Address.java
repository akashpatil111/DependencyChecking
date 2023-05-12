package com.ManytoOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue	(strategy=GenerationType.IDENTITY)
	private int addId;
	private String addCity;
	private String addCountry;
	private String addState;
	private int addPincode;
	public int getAddId() {
		return addId;
	}
	public void setAddId(int addId) {
		this.addId = addId;
	}
	public String getAddCity() {
		return addCity;
	}
	public void setAddCity(String addCity) {
		this.addCity = addCity;
	}
	public String getAddCountry() {
		return addCountry;
	}
	public void setAddCountry(String addCountry) {
		this.addCountry = addCountry;
	}
	public String getAddState() {
		return addState;
	}
	public void setAddState(String addState) {
		this.addState = addState;
	}
	public int getAddPincode() {
		return addPincode;
	}
	public void setAddPincode(int addPincode) {
		this.addPincode = addPincode;
	}
	
	
}
