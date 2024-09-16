package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class EmplyoeeMain {

	public static void main(String[] args) {
		
		
		Emplyoee[] arr= {
				new Emplyoee(1,"Rahul",12000.0),
				new Emplyoee(3,"Kuldeep",42000.0),
				new Emplyoee(5,"Piyush",34000.0),
				new Emplyoee(4,"Sachin",20000.0),
				new Emplyoee(2,"Prakash",18000.0),
				
		};

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		class Demo implements Comparator<Emplyoee>{
//			@Override
//			public int compare(Emplyoee x, Emplyoee y) {
//				int diff= x.getId()-y.getId();
//				return diff;
//			}
//			
//		}
		
		
		
		
		System.out.println("After Sorting by id Araays are :");
		
		Arrays.sort(arr,(x,y)->-x.getId().compareTo(y.getId()));
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		}
			

}
