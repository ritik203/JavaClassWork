package com.sunbeam.inheritance;

import java.util.Scanner;

public class Student extends Person {

	private int roll;
	private float marks;
	private String course;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student(String name ,int age,int roll, float marks, String course) {
		super(name, age);
		System.out.println("parameter Def cons of Studnet");
		this.roll = roll;
		this.marks = marks;
		this.course = course;
	}

	public Student() {

		System.out.println("Def cons of Studnet");

	}

	public void accept() {
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll number ");
		this.roll = sc.nextInt();
		System.out.println("Enter Marks");
		this.marks = sc.nextInt();
		System.out.println("Enter Course");
		this.course = sc.next();
	}

	public void display() {
		super.display();
		System.out.println("Name : " + this.roll);
		System.out.println("Age: " + this.marks);
		System.out.println("Course: " + this.course);

	}

}
