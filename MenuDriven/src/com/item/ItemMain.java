package com.item;

import java.util.Scanner;

public class ItemMain {

	public static void main(String[] args) {
		
		RetailShop r=new RetailShop();
		Scanner sc=new Scanner(System.in);
		int choice = 0;
		
		
		while(choice !=5){
			System.out.println("1. Add item");
			System.out.println("2. Search item");
			System.out.println("3. remove item");
			System.out.println("4. Calculate price of item");
			System.out.println("5. Exit");
			System.out.println("Enter your choice: ");
			
			 choice =sc.nextInt();
			sc.nextLine();
	
			switch(choice ) {
			case 1:
				System.out.println("enter item name");
				String name =sc.nextLine();
				System.out.println("enter item price");
				Double price =sc.nextDouble();
				System.out.println("enter item quantity");
				int quantity =sc.nextInt();
				
				sc.nextLine();
				r.addItem(new Item(name,price,quantity));
				 break;
            case 2:
                System.out.print("Enter item name to retrieve: ");
                String itemName = sc.nextLine();
                try {
                    Item item = r.searchbyName(itemName);
                    System.out.println(item);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 3:
                System.out.print("Enter item name to remove: ");
                String removeName = sc.nextLine();
                r.remove(removeName);
                break;
            case 4:
                double totalPrice = r.calculate();
                System.out.println("Total price: " + totalPrice);
                break;
                
            case 5:
            	break;
            
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
		
		 r.saveItemsToFile("items.txt");
         System.out.println("Items saved to file.");
		
}
			
		
		

	}


