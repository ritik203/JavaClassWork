package com.sunbeam;



public class ShapeMain {

	public static void main(String[] args) {

		Shape s[]= {
			new Rectangle(10.5,11.1),
			new Square(4),
			new Circle(2)
			
			
		};
		for (int i = 0; i < s.length; i++) {
			double area = s[i].calcArea();
			double peri= s[i].calPeri();
			System.out.println("Area is "+area+"   peri is: "+peri );
		}
		
		
	}

}
