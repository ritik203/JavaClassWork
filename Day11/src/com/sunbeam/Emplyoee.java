package com.sunbeam;

public class Emplyoee {
	private String name;
	private int id;
	private double salary;
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}

	public void setSalary(double salary) {
		this.salary=salary;
		
	}
	public double getSalary() {
		return salary;
	}
	
	public Emplyoee(){}
	
	public Emplyoee(int id,String name,double salary) {
		this.id=id;
        this.name=name;
        this.salary=salary;
		
	}
	
	public String toString() {
		return "Id : "+id+" Name: "+name+" Salary :"+salary;
	}
	
	
	
	
	
	
	
	
}
