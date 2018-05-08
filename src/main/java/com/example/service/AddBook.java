package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.object.Book;
import com.example.sqlmap.BookSQL;

@Component
public class AddBook
{
	@Autowired
	BookSQL bookSql;
	public int result;
	
	//Book cartoon = new Book("Detective Conan", "Gosho Aoyama");
	//Book history = new Book("World War II", "Hitler");
	
	public int getResult(Book book)
	{
		return result = bookSql.addBookResult(book);
	}
}
