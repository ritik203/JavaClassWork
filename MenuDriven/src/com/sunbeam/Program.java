package com.sunbeam;
import java.util.Scanner;


enum Operations{Add,Search,Remove,Display,Modify,Exit;}



public class Program {

	public static void main(String[] args) {
		Book book = new Book();
		try(Scanner sc = new Scanner(System.in)){
			
			
			
			int choice = 0;
			
			do {
				System.out.print(
						"Menu\n"+
						"1.Add Book\n"+
						"2.Search Book with name\n"+
						"3.Remove Book\n"+
						"4.Display all Books\n"+
						"5.Modify Books\n"+
						"0.Exit\n"
						);
				
				System.out.println();
				
				System.out.println("Enter the choice : ");
				choice = sc.nextInt();
				
				switch(choice) {
				case 1:
					book.addBook();
					break;
				case 2:
					book.searchBook();
					break;
				case 3:
					book.remove();
					break;
				
				case 4:
					book.displayAll();
					break;
					
				case 5:
					book.modifyBook();
					break;
					
				}
				
			}while(choice!=0);
			
		}
		

		 book.saveBooksToFile("books.txt");
        System.out.println("Books saved to file.");

	}

}
