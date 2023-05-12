package com.demo;

public class Students1 {

	private int balance=5000;
	
	public void setBalance(int bal) {
		this.balance=bal;
	}
	public int getBalance() {
		return balance;
	}
	
	
	public int getWithdraw(int amount) {
		
		balance=balance-amount;
		return balance;
	}
}
