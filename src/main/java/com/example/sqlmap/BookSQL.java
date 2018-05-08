package com.example.sqlmap;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
	
	public static final String SQL_Select_All_BookResult=""
			+ " SELECT "
			+ "		ID, NAME, AUTHOR"
			+ " FROM BOOK";
	@Select(SQL_Select_All_BookResult)
	public List<Book> getAllBookResult();
	
	public static final String SQL_Delete_BookResult_ByName=""
			+ " DELETE "
			+ " FROM Book "
			+ " WHERE NAME = #{nameBook} ";
	/*@Delete(SQL_Delete_BookResult_ByName)
	public Integer deleteBookResultByName(@Param("nameBook") String nameBook);*/
}
