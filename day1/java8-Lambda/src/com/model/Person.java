package com.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Person {

	private String firstName;
	private String lastName;
	private LocalDate dob;
	private Gender gender;

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", gender=" + gender
				+ "]";
	}

	public Person(String firstName, String lastName, LocalDate dob, Gender gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public static List<Person> getPersons() {

		ArrayList<Person> persons = new ArrayList<>();

		Person person1 = new Person("Naga", "N", LocalDate.of(1983, 10, 05), Gender.MALE);
		Person person2 = new Person("Abc", "A", LocalDate.of(1973, 10, 05), Gender.MALE);
		Person person3 = new Person("Indu", "I", LocalDate.of(1993, 10, 05), Gender.FEMALE);

		persons.add(person1);
		persons.add(person2);
		persons.add(person3);

		return persons;
	}

}
