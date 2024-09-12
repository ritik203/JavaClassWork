package com.sunbeam;

import java.util.Arrays;

public class EmplyoeeMain {

	public static void main(String[] args) {
		
		Emplyoee[] e= {
				new Emplyoee(1,"abhay",1000),
				new Emplyoee(5,"rahul",40000),
				new Emplyoee(4,"Pratik",20000),
				new Emplyoee(3,"Sameer",30000),
				new Emplyoee(2,"Ishawar",25000)		
				
		};
	      Arrays.sort(e);
		
		for(int i= 0;i<e.length;i++) {
			System.out.println(e[i]);
		}
		
		
		

	}

}
