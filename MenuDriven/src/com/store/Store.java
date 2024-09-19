package com.store;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Store {
	private String name;
	private double price;
	private int quantity;

	Scanner sc = new Scanner(System.in);
	List<Store> itemList = new ArrayList<Store>();
	
	public Store() {
		// TODO Auto-generated constructor stub
	}

	public Store(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.setQuantity(quantity);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity < 1) {
			System.out.println("Quantity should not be 0 or less.");
		} else {
			this.quantity = quantity;
		}

	}

	@Override
	public String toString() {
		return "Store [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public void addItem() {
		System.out.println("Enter the name of item : ");
		name = sc.next();
		System.out.println("Enter the Price of the item : ");
		price = sc.nextDouble();
		System.out.println("Enter the Quantity : ");
		quantity = sc.nextInt();

		itemList.add(new Store(name, price, quantity));

	}
	
	

	public void searchByName() {
		// To searchByName the item

		System.out.println("Enter the item to search : ");
		String itemName = sc.next();
		for (Store store : itemList) {
			if (store.getName().equalsIgnoreCase(itemName)) {
				System.out.println(store);
			}
			else {
				System.out.println("Item is not found.");
			}

		}

	}

	public void retrive() {
		//Search
		System.out.println(" Displaying all items ");
		for (Store store : itemList) {
				System.out.println(store);	
		}
	}

	public void remove() {
		// remove
		System.out.println("Enter the item to remove : ");
		String itemName = sc.next();
		for (Store store : itemList) {
			if (store.getName().equalsIgnoreCase(itemName)) {
				int index = itemList.indexOf(store);
				itemList.remove(index);
				System.out.println("Item removed sucessfully.");
//				this.retrive();
			}
			else {
				System.out.println("Item not found.");
			}
		}
		
	}

	public void CalculateTotal() {
		double totalPrice = 0.0;
		for (Store store : itemList) {
			totalPrice += (store.getQuantity()*store.getPrice());
		}
		System.out.println("Your total price is : "+totalPrice);
		
	}

}
