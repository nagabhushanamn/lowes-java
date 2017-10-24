package com.lowes.mts.web;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class TxrResponse {

	@XmlElement(name = "message")
	private String message;

	@Override
	public String toString() {
		return "TxrResponse [status=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
