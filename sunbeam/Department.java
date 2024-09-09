package com.sunbeam;

import java.util.Scanner;
public class Department {
	private int age;
	private String name;
	
	public Department() {
		
	}
public Department(int age,String name) {
	this.age=age;
	this.name=name;
		
	}
public void display1() {
	System.out.println("Age :"+this.age);
	System.out.println("Name :"+this.name);
}
public void accept() {
Scanner sc= new Scanner(System.in);
System.out.println("Enter age");
age=sc.nextInt();
System.out.println("Enter Name");
name=sc.next();
}

}
