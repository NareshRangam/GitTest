package com.ss;

import java.util.List;

public class Customer {
	private Integer id;
	private String name;
	private List<Cars> cars;
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
	public List<Cars> getCars() {
		return cars;
	}
	public void setCars(List<Cars> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", cars=" + cars + "]";
	}
	public Customer(Integer id, String name, List<Cars> cars) {
		super();
		this.id = id;
		this.name = name;
		this.cars = cars;
	}
	
	

}
