package com.demo3;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Project2 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int proid;
	private String projname;
	
	
	@ManyToMany
	Set<Employe2> emp=new HashSet<Employe2>();


	public int getProid() {
		return proid;
	}


	public void setProid(int proid) {
		this.proid = proid;
	}


	public String getProjname() {
		return projname;
	}


	public void setProjname(String projname) {
		this.projname = projname;
	}


	public Set<Employe2> getEmp() {
		return emp;
	}


	public void setEmp(Set<Employe2> emp) {
		this.emp = emp;
	}
	
	
	
	
}
