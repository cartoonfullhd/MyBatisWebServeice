package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.object.Book;
import com.example.service.AddBook;

@RestController
//@Component
public class BookRest
{
	@Autowired
	AddBook addBook;
	
	@PostMapping(path="/addbook")
	public int getResultInsertBook(@RequestParam(value="name", required = true) String name,
	        @RequestParam(value="author", required = true) String author)
	{
			Book setBook = new Book(name, author);
			return addBook.getResult(setBook);
	}
}
