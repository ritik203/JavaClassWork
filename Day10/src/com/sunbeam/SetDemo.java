package com.sunbeam;
import java.util.*;

public class SetDemo {

	public static void main(String[] args) {

		
		Set<String> s=new TreeSet<String>();
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Values");
		 
		 for (int i = 0; i<10; i++) {
			 String value=sc.next();
			s.add(value);
		}	
		 for(String value:s) {
			 System.out.println(value);
		 }
		 
		s.add("America");
		s.add("China");
		s.add("Bankok");
		s.add("China");
		s.add("India");
		s.add("Pakistan");
		s.add("Russia");
		s.add("Uganda");
		s.add("Afganisthan");
		s.add("India");
		
		s.remove("e");
		System.out.println(s.size());
Collections.addAll(s, "DisneyLand","Vietnam","Afganisthan","ViceCity","Bali","Thailand");
		System.out.println(s.toString()); 
		
		
		
		for(String str:s) {
			System.out.println(str);
		}
		

		
		
		
		
		
		
		
	}

}
