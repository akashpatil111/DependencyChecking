package com.demo1;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
@Entity
public class Project0 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int projid;
	private String projname;
	
	@ManyToMany
	@JoinColumn(name="emp_id")
	private Set<Employe0> employe=new HashSet<Employe0>();

	public int getProjid() {
		return projid;
	}

	public void setProjid(int projid) {
		this.projid = projid;
	}

	public String getProjname() {
		return projname;
	}

	public void setProjname(String projname) {
		this.projname = projname;
	}

	public Set<Employe0> getEmploye() {
		return employe;
	}

	public void setEmploye(Set<Employe0> employe) {
		this.employe = employe;
	}

	
	
	
}
