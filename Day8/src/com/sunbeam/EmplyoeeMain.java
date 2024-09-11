package com.sunbeam;

import java.util.Arrays;

public class EmplyoeeMain {

	public static void main(String[] args) {
	
		 Emplyoee[] a= {
			new Emplyoee(5,"Abc",1234),
			new Emplyoee(2,"Bbc",234),
			new Emplyoee(3,"Zbc",133),
			new Emplyoee(4,"Kbc",54334),
			new Emplyoee(1,"fbc",5343),
				
		};
		 
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++) {
			 System.out.println(a[i]);
		 }	
		
		

	}

}
