package com.sunbeam;

public class Circle implements Shape{
	
	private double r;
	
	
	
	

	public Circle() {
		super();
	}





	public Circle(double r) {
		super();
		this.r = r;
	}





	@Override
	public double calcArea() {
		double area=2*r;
		return area;
	}

	

}
