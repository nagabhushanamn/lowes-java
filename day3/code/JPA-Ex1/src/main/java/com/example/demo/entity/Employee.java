package com.example.demo.entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "EMPLOYEES", schema = "em")
public class Employee {

	@Id
	private int id;
	private String name;
	private double salary;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dob;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	@Lob
	@Basic(fetch = FetchType.LAZY)
	private String profile;
	@Lob
	private byte[] pic;
	@Transient
	private String nonColumn;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public Date getDob() {
		return dob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dob=" + dob + ", gender=" + gender
				+ ", profile=" + profile + ", pic=" + Arrays.toString(pic) + ", nonColumn=" + nonColumn + "]";
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
