package com.sunbeam;

import java.util.Scanner;

enum Arithmatic{Addition, Subtraction,Division,Multiplication,Exit;
}

public class EnumDemo {
	

	public static void main(String[] args) {
     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number ");
		double a=sc.nextInt();
		System.out.println("Enter Second Number");
		double b=sc.nextInt();
		System.out.println("Enter your Choice");
		
		Arithmatic arith[]=Arithmatic.values();
		for (Arithmatic arithmatic : arith) {
			System.out.println(arithmatic.ordinal()+"."+arithmatic.name());
		}
		
		
		Arithmatic ar=arith[sc.nextInt()];
		
		switch (ar) {
		case Addition:
			double res=a+b;
			    System.out.println("addition is :"+res);
			break;
		case Subtraction:
			double res1=a-b;
			    System.out.println("addition is :"+res1);
			break;
		case Multiplication:
			double res2=a*b;
			    System.out.println("addition is :"+res2);
			break;
		case Division:
			double res3=a/b;
			    System.out.println("addition is :"+res3);
			break;
			
		case Exit:
			System.exit(0);
			break;
		}
		
		
		
		
		
		
	}

}
