package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.Book;
import com.example.sqlmap.BookSQL;


@RestController
public class BookRest
{
	@Autowired 
	BookSQL bookSql;
	
	@PostMapping(path="/addBook")
	public int getResultInsertBook(@RequestParam(value="name", required = true) String name,
	        @RequestParam(value="author", required = true) String author)
	{
			Book setBook = new Book(name, author);
			return bookSql.addBookResult(setBook);
	}
	
	@GetMapping(path="/allBook")
	public List<Book> getAllBookResult()
	{
		return bookSql.getAllBookResult();
	}
	
	@DeleteMapping(path="/deleteBook")
	public int deleteBookResult(@RequestParam(value="id", required = true) int id)
	{
		return bookSql.deleteBookResultByID(id);
	}
	
	@PutMapping(path="/updateBook")
	public int updateBookResult(@RequestBody(required=true) Book book)
	{
		return bookSql.updateBookResultById(book);
	}
}
