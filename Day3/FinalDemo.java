package com.sunbeam;

public class FinalDemo {
	
	private final double PI=3.14;
	private double radius;
	
	{
		//this.PI=6.4;
	}
	
	public FinalDemo(double radius) {
		this.radius=radius;
	
	}
	public double calArea() {
		return 2*PI*radius;
	}
	
	
public static void main(String[] args) {
	FinalDemo f=new FinalDemo(10);
    System.out.println("area is "+f.calArea());
}
	

}
