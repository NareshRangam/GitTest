package com.ss;

public class Book {
	
	private Integer id;
	private String name;
	private Integer pages;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Book(Integer id, String name, Integer pages) {
		super();
		this.id = id;
		this.name = name;
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pages=" + pages + "]";
	}
	
	

}
