package com.shape;

import java.util.Scanner;

public class Rectangle extends Shape {
	
	protected double length;
	protected double breadth;
	
	
	public void showRecord() {
		
		
	}
	public void calArea()  {
		this.area=this.length*this.breadth;
	}
	
	
	
	public void acceptRecord() {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Length :");
		this.length=sc.nextDouble();
		System.out.print("Enter breadth :");
		this.breadth=sc.nextDouble();
		
	}
	
	
	

}
