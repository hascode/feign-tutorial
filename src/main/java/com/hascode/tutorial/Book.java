package com.hascode.tutorial;

import java.math.BigDecimal;
import java.util.Calendar;

public class Book {
	private String id;
	private String title;
	private BigDecimal price;
	private Calendar published;

	public Book() {
	}

	public Book(String id, String title, BigDecimal price, Calendar published) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.published = published;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Calendar getPublished() {
		return published;
	}

	public void setPublished(Calendar published) {
		this.published = published;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + ", published=" + published.toInstant()
				+ "]";
	}

}