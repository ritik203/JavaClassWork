package com.sunbeam;

public class CustomExpMain {

	public static void main(String[] args) {
		
		try{
			ExceptionHandling e=new ExceptionHandling();
		
		e.setHrs(65);
		e.setMins(45);
		e.setSecs(54);
		System.out.println(" time is :"+e.toString());
		
		}
		catch(InvalidTimeException e) {
			System.out.println("Invalid Field :"+e.getInvalidField());
			System.out.println("Invalid input :"+e.getInvalidInput());
			System.out.println("Invalid Message :"+e.getMessage());
		}
		
		
		
	}

}
