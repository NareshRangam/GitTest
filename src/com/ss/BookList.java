package com.ss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookList {
	
	public List<Book> getBookList()
	{
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(1, "Java", 20));
		books.add(new Book(2, "Python", 10));
		books.add(new Book(3, "Net", 12));
		books.add(new Book(4, "C", 13));
		return books;
	}
	
	public List<Book> getBookListss()
	{
	return (getBookList().size() > 0) ? getBookList():getBookList() ;
	}
	
}
