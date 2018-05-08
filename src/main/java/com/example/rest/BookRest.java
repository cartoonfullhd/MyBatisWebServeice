package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.AddBook;

@RestController
@Component
public class BookRest
{
	@Autowired
	AddBook addBook;
	
	@PostMapping(path="/addbook")
	public int getResultInsertBook()
	{
		return addBook.getResult();
	}
}
