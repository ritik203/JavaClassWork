package com.sunbeam;

import java.util.Scanner;

public class DoubleClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Value :");

		if (sc.hasNextInt()) {
			System.out.println("First number is not a type ofDouble ");
			System.exit(0);
		}

		if (!sc.hasNextDouble()) {
			System.out.println("First number is not a type ofDouble ");
			System.exit(0);
		}
		double a = sc.nextDouble();

		System.out.println("Enter Second Value :");

		if (sc.hasNextInt()) {
			System.out.println("Second number is not a type ofDouble ");
			System.exit(0);
		}

		if (!sc.hasNextDouble()) {
			System.out.println("Second number is not a type ofDouble ");
			System.exit(0);
		}

		double b = sc.nextDouble();

		double avg = (a + b) / 2;
		System.out.println("Average is :" + avg);
		sc.close();

	}

}
