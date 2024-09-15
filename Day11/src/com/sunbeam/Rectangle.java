package com.sunbeam;

public class Rectangle implements Shape{
	private double l;
	private double b;
	
	public Rectangle() {}
	
	
	

	public Rectangle(double l, double b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	public double calcArea() {
		double area=l*b;
		return area;
	}

	@Override
	public double calPeri() {
		double peri=2*l*b;
		return peri;
	}

}
