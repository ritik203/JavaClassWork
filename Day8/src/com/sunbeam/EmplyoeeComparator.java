package com.sunbeam;

public class EmplyoeeComparator {

	
	private int id;
	private String name;
	private double salary;
	public EmplyoeeComparator(int id, String name, double salary) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Product1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	


}
