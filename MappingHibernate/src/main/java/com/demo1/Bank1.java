package com.demo1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Bank1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bankid;
	private String bankname;
	
	@ManyToOne
	@JoinColumn(name="emp_id")
	private Employe1 emp;

	public int getBankid() {
		return bankid;
	}

	public void setBankid(int bankid) {
		this.bankid = bankid;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public Employe1 getEmp() {
		return emp;
	}

	public void setEmp(Employe1 emp) {
		this.emp = emp;
	}
	
	
	
	
	
}
