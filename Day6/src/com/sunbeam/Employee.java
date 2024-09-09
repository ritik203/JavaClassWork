package com.sunbeam;

import javax.management.ObjectInstance;

public class Employee {
 private int empid;
 private String name;
 private Double salary;
 
 
 public int getEmpid() {
	 return empid;
 }
 public void setEmpid(int empid) {
	 this.empid=empid;
 }
 
 public void setSalary(double salary) {
	 this.salary=salary;
 }
 public double getSalary() {
	 return salary;
 }

 public void setName(String name)
 {
	 this.name=name;
 }
 public String getName() {
	 return name;
	 
 }
 public boolean equals(Object obj) {
	 if(obj == null)
		 return false;
	 if(!(obj instanceof Employee))
		 return false;
	 Employee other = (Employee)obj;
	 if(this.empid == other.empid)
		 return true;
	return false;

		 
		 
 }
 
 
 
 
 public Employee(int empid, String name, Double salary) {
	super();
	this.empid = empid;
	this.name = name;
	this.salary = salary;
}
public Employee() {
	 
 }
 public String toString() {
	 return "Name: "+name+"Empid: "+empid+ "Salary: "+salary;
 }
 
 
 

}
