package com.shape;

import java.util.Scanner;

public class Cricle extends Shape{
	protected double radius;
	
	public void acceptRecord() {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		this.radius=sc.nextDouble();
		
	}
   
    public void  calArea() {
    	this.area= Math.PI*2*radius;
	
   }
	
	
	

}
