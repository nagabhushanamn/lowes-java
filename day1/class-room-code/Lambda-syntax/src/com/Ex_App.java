package com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

enum Gender {
	MALE, FEMALE
}

class Person {

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
		Person person2 = new Person("Ria", "A", LocalDate.of(2015, 10, 05), Gender.FEMALE);
		Person person3 = new Person("Indu", "I", LocalDate.of(1993, 10, 05), Gender.FEMALE);

		persons.add(person1);
		persons.add(person2);
		persons.add(person3);

		return persons;
	}

}

// ----------------------------------------------------------

// API
class Lib {

	public static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T item : list) {
			consumer.accept(item);
		}
	}

	public static <T, R> List<R> map(List<T> list, Function<T, R> mapper) {
		List<R> mappedList = new ArrayList<>();
		for (T item : list) {
			mappedList.add(mapper.apply(item));
		}
		return mappedList;
	}

	public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> filteredList = new ArrayList<>();
		for (T item : list) {
			if (predicate.test(item)) {
				filteredList.add(item);
			}
		}
		return filteredList;
	}

}

// -----------------------------------------------------------

public class Ex_App {

	public static void main(String[] args) {

		List<Person> list = Person.getPersons();

		// Lib.forEach(list, item->System.out.println("Name:"+item.getFirstName()));
		// Lib.forEach(list, item->System.out.println(item.getDob()));

		// List<String> nameList = Lib.map(list, item -> item.getFirstName());
		// System.out.println(nameList);

		List<Person> femaleList = Lib.filter(list, item -> item.getGender() == Gender.FEMALE);
		System.out.println(femaleList);
	}

}
