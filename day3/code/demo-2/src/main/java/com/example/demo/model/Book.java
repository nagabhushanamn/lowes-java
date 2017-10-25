package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "book", schema = "shop")
public class Book {

	@Id
	private String isbn;
	private String name;
	private String price;
	@Temporal(TemporalType.DATE)
	@Column(name = "publish_date")
	private Date publish_date;

	public Book(String isbn, String name, String price, Date publish_date) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.price = price;
		this.publish_date = publish_date;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", price=" + price + ", publishDate=" + publish_date + "]";
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Date getPublishDate() {
		return publish_date;
	}

	public void setPublishDate(Date publishDate) {
		this.publish_date = publishDate;
	}

}
