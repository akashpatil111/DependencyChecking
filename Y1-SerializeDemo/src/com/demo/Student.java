package com.demo;

import java.io.Serializable;

public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7161647281242329198L;
	int id;
	String name;
	String city;
	 transient int salary;
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + "]";
	}

	Student(int id,String name,String city,int  salary){
                                               		
		this.id=id;
		this.name=name;
		this.city=city;
		this.salary=salary;
		
	}
	
	
	

}
