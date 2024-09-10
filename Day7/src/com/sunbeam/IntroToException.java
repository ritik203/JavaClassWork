package com.sunbeam;
import java.util.Scanner;

public class IntroToException {
	
	public static int divide(int num, int den) {
		if (den==0) {
	   System.out.println("Deno can't be Zero");
	   System.exit(0);
		}
		int res =num/den;
		return res;
		
	}
	
	
	
	
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Numerator :");
		int num = sc.nextInt();

		System.out.println("Enter Denominator:");
		int den = sc.nextInt();
		int res=divide(num,den);
		System.out.println("Result :"+ res);
		
		
//}
//
//		int res;
//		if (den == 0) {
//			res = num / den;
//			System.out.println("Result " + res);
//		} else {
//			System.out.println("You have Entered Zero");
//           sc.close();
//		}

	}

}
