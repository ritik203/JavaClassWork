package com.sunbeam;

import java.util.Scanner;

class Person {
	private int age;
	private String name;
	
	public Person() {
		
	}
public Person(int age,String name) {
	this.age=age;
	this.name=name;
		
	}
public void display() {
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
class Student extends Person{
	private int id ;
	private int rollno;
	
	public Student(){
	}
public Student(int age,String name,int id ,int rollno){
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
	super.display();
	System.out.println("Student id is:"+this.id);
	System.out.println("Student id is:"+this.rollno);


}
}
public class Overriding{
 
public static void main(String[] args) {
	Student s=new Student(12,"ree",45,43);
	//s.accept();
	s.display();
	
	
	
}
}



