package com.example.object;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Book
{
	private String name;
	private String author;

	public Book(String name, String author)
	{
		super();
		this.name = name;
		this.author = author;
	}
}


