package com.sunbeam;

import java.util.Scanner;

public class Employee extends Department{
	private int id ;
	private int rollno;
	
	public Employee(){
	}
public Employee(int age,String name,int id ,int rollno){
	super(age, name);
		this.id=id;
		this.rollno=rollno;
		
	}

public void accept() {
	super.accept();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id");
	id=sc.nextInt();
	System.out.println("Enter roll no");

	rollno=sc.nextInt();
}

public void display() {
	
	System.out.println("Student id is:"+this.id);
	System.out.println("Student roll no is:"+this.rollno);


}
}