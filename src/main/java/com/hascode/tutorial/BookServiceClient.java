package com.hascode.tutorial;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.jaxrs.JAXRSContract;

public class BookServiceClient {

	public static void main(String[] args) {
		BookService bookService = Feign.builder().contract(new JAXRSContract()).encoder(new JacksonEncoder())
				.decoder(new JacksonDecoder()).target(BookService.class, "http://localhost:8080/tutorial/rs");

		System.out.println("fetching existing books..");
		List<Book> books = bookService.getAll();
		System.out.println(String.format("%s books received", books.size()));
		books.forEach(System.out::println);

		Book book = new Book(null, "One Book", BigDecimal.TEN, Calendar.getInstance());
		System.out.println("saving new book: " + book);
		bookService.saveBook(book);

		System.out.println("fetching existing books..");
		books = bookService.getAll();
		System.out.println(String.format("%s books received", books.size()));
		books.forEach(System.out::println);

		String id = books.get(0).getId();
		System.out.println("fetching book by id: " + id);
		Book byId = bookService.getById(id);
		System.out.println(String.format("book for id %s found: %s", id, byId));

		System.out.println("removing book with id: " + id);
		bookService.deleteBook(id);

		System.out.println("fetching existing books..");
		books = bookService.getAll();
		System.out.println(String.format("%s books received", books.size()));
		books.forEach(System.out::println);
	}

}
