package com.ss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  String str = "Naresh"; 
		  StringBuilder sb = new StringBuilder();
		  for(int i=str.length()-1;i>=0;i--) {
			  System.out.println(str.charAt(i)); 
			  sb.append(i);
			  }
		 
	
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Naresh");
		map.put(2, "Lokesh");
		map.put(3, "Adi");
		map.put(4, "Balraj");
		map.entrySet().stream().filter(k-> k.getKey()%2 ==0).forEach(k->System.out.println(k));
		
		List<Book> books = new BookList().getBookList();
		Collections.sort(books, (o1,o2)-> o2.getName().compareTo(o1.getName()));
		books.stream()
		.filter(t-> t.getPages()>10)
		.forEach(book -> System.out.println(book.getPages()));
		System.out.println(books);
		List<Book> bookss =	books.stream()
				.sorted((o1,o2)-> o2.getName().compareTo(o1.getName())).collect(Collectors.toList());
		
		List<Book> boo =	books.stream()
				.sorted(Comparator.comparing(Book::getPages).reversed()).collect(Collectors.toList());
		System.out.println("ss   :::"+boo);
			
		Map<Book, Integer> bookMap = new HashMap<Book, Integer>();
		bookMap.put(new Book(1, "Java", 20),1);
		bookMap.put(new Book(2, "Python", 10),2);
		bookMap.put(new Book(3, "Net", 12),3);
		bookMap.put(new Book(4, "C", 13),4);
		map.entrySet().stream().forEach(System.out::println);
		bookMap.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Book::getName).reversed()))
		.forEach(System.out::println);
		List<String> bookNames = books.stream().map(Book::getName).collect(Collectors.toList());
		System.out.println(bookNames);
		
		
	}

}
