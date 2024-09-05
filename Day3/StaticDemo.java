package com.sunbeam;

import java.util.Scanner;

public class StaticDemo {

	private float height;
	private float weight;
	private static float price = 500;

	public StaticDemo(float height, float weight) {
		this.height = height;
		this.weight = weight;
	}
	public StaticDemo() {
		
	}

//	static {
//
//	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public static float getPrice() {
		return price;
	}

	public static void setPrice(float price) {

		StaticDemo.price = price;
	}

	public void Display() {
		System.out.println("height" + height);
		System.out.println("weight" + weight);
		System.out.println("price" + price);

	}

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Height and Weight");
		float height= sc.nextFloat();
		
		float weight=sc.nextFloat();
		
		StaticDemo s = new StaticDemo(height,weight);
		s.Display();
	
		s.setHeight(300);
		System.out.println(s.getHeight());
	
		

	}
}
