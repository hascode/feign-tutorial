package com.hascode.tutorial;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book")
public interface BookService {
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Book saveBook(final Book book);

	@DELETE
	@Path("/{id}")
	public void deleteBook(final @PathParam("id") String id);

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getAll();

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getById(final @PathParam("id") String id);
}
