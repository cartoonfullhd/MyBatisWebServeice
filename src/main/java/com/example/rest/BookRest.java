package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.Book;
import com.example.service.AddBook;
import com.example.sqlmap.BookSQL;

@RestController
@Component
public class BookRest
{
	@Autowired
	AddBook addBook;
	@Autowired 
	BookSQL bookSql;
	
	@PostMapping(path="/addBook")
	public int getResultInsertBook(@RequestParam(value="name", required = true) String name,
	        @RequestParam(value="author", required = true) String author)
	{
			Book setBook = new Book(name, author);
			return addBook.getResult(setBook);
	}
	
	@GetMapping(path="/allBook")
	public List<Book> getAllBookResult()
	{
		return bookSql.getAllBookResult();
	}
}
