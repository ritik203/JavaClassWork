package com.sunbeam;

public class Square implements Shape {
    private double s;
    public Square() {}
    
    
	public Square(double s) {
		
		this.s = s;
	}

	@Override
	public double calcArea() {
		double area= s*s;
		return area;
	}

	@Override
	public double calPeri() {

	double peri=4*s;
		
		return peri;
	}

}
