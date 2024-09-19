package com.sunbeam;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Book implements Comparable<Book>{
	
	Scanner sc=new Scanner(System.in);
	List <Book> list=new ArrayList<>();
	
	
	private String bookname;
	private String author;
	private double price;
	
public Book(String bookname, String author, double price) {
		
		this.bookname = bookname;
		this.author = author;
		this.setPrice(price);
	}
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		try {
			if(price <0) {
				throw new PriceTooLowException("Price too low");
			}else {
				this.price = price;
			}
		}catch (PriceTooLowException e ) {
			e.printStackTrace();
		}
		
	}
	
	public Book() {
		
	}
	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", author=" + author + ", price=" + price + "]";
	}
	
	public void displayAll() {
		for (Book book : list) {
			System.out.println(book);
		}Collections.sort(list);
		System.out.println(list);
	}
	
	public void addBook() {
		System.out.println("Enter Book Name: ");
		String bookname=sc.next();
		System.out.println("Enter Book Author: ");
		String author=sc.next();
		System.out.println("Enter Book price: ");
		double price=sc.nextDouble();
		
		list.add(new Book(bookname,author,price));
		
		
	}
	public void searchBook() {
		System.out.println("Enter Book to Search: ");
		String booksrc=sc.next();
		for(Book book :list) {
		if(book.getBookname().equals(booksrc)) {
		  System.out.println(book);
		}
		
		}
	}
	
	public void remove() {
		System.out.println("Enter Book to remove: ");
		String booksrc=sc.next();
//		for(Book book :list) {
//		if(book.getBookname().equals(booksrc)) {
//			int index=list.indexOf(booksrc);
//			list.remove(index);
//			this.displayAll();
//		}
//		
//		}
		for(int  i=0;i<list.size();i++) {
			if(list.get(i).getBookname().equals(booksrc)) {
				System.out.println("The book is removed :" + list.get(i));
				list.remove(i);
			}
		}
	}
	@Override
	public int compareTo(Book o) {
		
		Book other = (Book) o;
		int diff = this.getBookname().compareToIgnoreCase(other.getBookname());
		return diff;
	
	}
	public void modifyBook() {

		System.out.println("Enter the book name to Modify the price :");
		// sc.next();
		String bookName = sc.next();
		System.out.println("Enter the new price :");
		double newPrice = sc.nextDouble();
		
		for (Book book1 : list) {
			if (book1.getBookname().equals(bookName)) {
				book1.setPrice(newPrice);
				System.out.println("The book is modified " + book1);

			}
		}
	}
	

	public void saveBooksToFile(String filename) {
		
		try (FileWriter writer = new FileWriter(filename)) {
	        for (Book book : list) {
	            writer.write(book.toString() + "\n");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	
		
	}
	
	

}
