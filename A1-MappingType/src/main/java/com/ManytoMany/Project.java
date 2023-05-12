package com.ManytoMany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Project {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int projId;
	private String projName;
	
	
	@ManyToMany
	private Set<Employe> emp=new HashSet<Employe>();


	public int getProjId() {
		return projId;
	}


	public void setProjId(int projId) {
		this.projId = projId;
	}


	public String getProjName() {
		return projName;
	}


	public void setProjName(String projName) {
		this.projName = projName;
	}


	public Set<Employe> getEmp() {
		return emp;
	}
    public void setEmp(Set<Employe> emp) {
		this.emp = emp;
	}
	
}
