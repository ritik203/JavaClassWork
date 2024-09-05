package com.sunbeam;

import java.util.Scanner;

public class ConversionClass {

	public static void main(String[] args) {

		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = Sc.nextInt();
		System.out.println("Given Number : " + n);

		String binary = Integer.toBinaryString(n);
		System.out.println("Binary Equivalent :" + binary);

		String octal = Integer.toOctalString(n);
		System.out.println("Binary Equivalent :" + octal);

		String hexadecimal = Integer.toHexString(n);
		System.out.println("Binary Equivalent :" + hexadecimal);

	}

}
