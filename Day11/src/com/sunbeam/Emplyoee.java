package com.sunbeam;

import java.util.Comparator;
import java.util.Objects;

public class Emplyoee{
	private String name;
	private Integer id;
	private double salary;
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public Integer getId() {
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
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emplyoee other = (Emplyoee) obj;
		return id == other.id;
	}
	
	
	
	
	
	
	
	
}
