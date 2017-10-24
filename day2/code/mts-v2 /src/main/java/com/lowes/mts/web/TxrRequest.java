package com.lowes.mts.web;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "request")
public class TxrRequest {

	private String fromAccNum;
	private String toAccNum;
	private double amount;

	@Override
	public String toString() {
		return "TxrRequest [fromAccNum=" + fromAccNum + ", toAccNum=" + toAccNum + ", amount=" + amount + "]";
	}

	@XmlElement(name = "from")
	public String getFromAccNum() {
		return fromAccNum;
	}

	public void setFromAccNum(String fromAccNum) {
		this.fromAccNum = fromAccNum;
	}

	@XmlElement(name = "to")
	public String getToAccNum() {
		return toAccNum;
	}

	public void setToAccNum(String toAccNum) {
		this.toAccNum = toAccNum;
	}

	@XmlElement(name = "amount")
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
