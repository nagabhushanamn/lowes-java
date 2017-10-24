package com.lowes.mts.model;

public class Account {

	private String num;
	private double balance;
	private AccountType type;

	@Override
	public String toString() {
		return "Account [num=" + num + ", balance=" + balance + ", type=" + type + "]";
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

}
