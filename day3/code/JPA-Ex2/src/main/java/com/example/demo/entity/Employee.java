package com.example.demo.entity;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
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
	
	//	@Embedded
	//	private Address address;
	//
	//	@Embedded
	//	@AttributeOverrides(
	//			{
	//				@AttributeOverride(name = "city", column = @Column(name = "home_city")),
	//				@AttributeOverride(name = "country", column = @Column(name = "home_country"))
	//			}
	//			)
	//	private Address homeAddress;
	
	
	@ElementCollection
	@CollectionTable(name="EMP_ADDRESS")
	private List<Address> addresses;
	
	
	

}
