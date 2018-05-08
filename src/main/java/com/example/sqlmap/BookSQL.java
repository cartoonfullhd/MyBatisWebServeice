package com.example.sqlmap;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.object.Book;

@Mapper
public interface BookSQL
{
	public static final String SQL_Add_BookResult=""
			+ "INSERT INTO Book ( "
			+ "Name, Author"
			+ " ) "
			+ " VALUES ( "
			+ " #{bk.name}, #{bk.author}"
			+ " ) ";
	@Insert(SQL_Add_BookResult)
	public Integer addBookResult(@Param("bk") Book bookTest);
}
