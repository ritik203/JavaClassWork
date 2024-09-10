package com.sunbeam;
import java.util.Scanner;

public class Exception1 {
	
	
	
	public static int divide(int num,int den) {
    if (den==0) 
    	throw new RuntimeException("Can't divide bye Zero");
		int res= num/den;
		return res;	
	}
	
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	try {
		
	   System.out.println("Enter Numerator :");
	 	int num=sc.nextInt();
	 	System.out.println("Enter a Deno");
	 	int den=sc.nextInt();
	 	int res=divide(num,den);
	 	System.out.println("Result is : "+res);

	   	
	}catch(RuntimeException e){
		System.out.println("Cant divide by 0");	
	}
	

	
	finally {
		sc.close();}
	
	
	
	
}
	
	
	
	
	
	
	

}
