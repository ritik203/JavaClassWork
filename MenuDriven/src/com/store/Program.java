package com.store;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Main program

		Store store = new Store();

		try (Scanner sc = new Scanner(System.in)) {

			int choice = 0;

			do {

				System.out.println("1. Add item.\n" + "2.Retrive item.\n" + "3. search by name.\n" + "4.Remove item\n"
						+ "5. Calculate total.\n");

				choice = sc.nextInt();

				switch (choice) {
				case 1:
					store.addItem();
					break;
				case 2:
					store.retrive();
					break;
				case 3:
					store.searchByName();
					break;
				case 4:
					store.remove();
					break;
				case 5:
					store.CalculateTotal();
				}

			} while (choice != 0);

		}

	}

}
