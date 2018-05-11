package com.example.sqlmap;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
	
	public static final String SQL_Delete_BookResult_ByID=""
			+ " DELETE "
			+ " FROM Book "
			+ " WHERE ID = #{idBook} ";
	@Delete(SQL_Delete_BookResult_ByID)
	public Integer deleteBookResultByID(@Param("idBook") int idBook);
	
	public static final String SQL_Update_BookResult_ById=""
			+ " UPDATE BOOK"
			+ "	SET NAME = #{bk.name}, AUTHOR = #{bk.author}"
			+ " WHERE ID = #{bk.id}";
	@Update(SQL_Update_BookResult_ById)
	public Integer updateBookResultById(@Param("bk") Book booktest);
}
