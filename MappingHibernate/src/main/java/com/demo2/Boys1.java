package com.demo2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Boys1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastname;
	
	private int age;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Address1 address;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Address1 getAddress() {
		return address;
	}


	public void setAddress(Address1 address) {
		this.address = address;
	}
	
	
	
	
	
}
