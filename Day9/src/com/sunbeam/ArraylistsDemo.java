package com.sunbeam;

import java.util.ArrayList;
import java.util.List;

public class ArraylistsDemo {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<>();
		
		list.add("rahul");
		list.add("rakesh");
		list.add("ramu");
		list.add("Sam");
		list.add("Rakeshl");
		list.add("abhay");
		list.add("balu");
		list.add("Soniya");	list.add("zeba");
		list.add("Stree");
		list.add("Pranav");
		list.add("Sam");
		list.add("pin2");
		list.add("Tinku");
		list.add("chin2");
		
		System.out.println("list is : "+list.toString());
		
		boolean b=list.isEmpty();
		System.out.println("is empty :"+b);
		
		System.out.println(list.size());
		System.out.println("list size  is : "+list.toString());
		
		list.add(6, "jacob");
		System.out.println("list after aadding element at index 6 is  : "+list.toString());
		
         int index=7;
		String s= list.get(index);
		System.out.println(s);
		
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.toLowerCase());
		
		
		int i=9;
		list.remove(i);
		System.out.println("list after removing is : "+list.toString());
		
/*<-------------------------------------------contains ----------------------------------------->*/		
		
		String find="Sam";
	boolean found= list.contains(find);
		if(found) {
			System.out.println("element found "+find);
		}else{
			System.out.println("Element not fount");
			}
/*<------------------------------------------- Indexof  ----------------------------------------->*/
		
System.out.println("Index of Elemenet is "+list.indexOf("Sam"));


System.out.println("Index of Elemenet is "+list.lastIndexOf("Sam"));


System.out.println("Remove element from the indx 8 is "+list.remove(8));


		
 
			
		
		

	}

}
