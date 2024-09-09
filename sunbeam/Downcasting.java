package com.sunbeam;

public class Downcasting {

	public static void main(String[] args) {
		Department s=new Employee(12,"er",23,23);
//		s.accept();
		s.display1();//upcasting
		
		Employee e=(Employee) s;
		e.display(); //downcasting
	
		
		
		
	}

}
