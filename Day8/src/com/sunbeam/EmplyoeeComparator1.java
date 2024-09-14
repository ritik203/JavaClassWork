package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class EmplyoeeComparator1 {

	public static void main(String[] args) {
		EmplyoeeComparator arr[]= {
				new EmplyoeeComparator(1,"abc",123),
				new EmplyoeeComparator(7,"bbc",123),
				new EmplyoeeComparator(5,"mbc",123),
				new EmplyoeeComparator(3,"dbc",123),
				new EmplyoeeComparator(4,"sbc",123),
		};
		
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
       
		
		class Demo implements Comparator<EmplyoeeComparator>{

			@Override
			public int compare(EmplyoeeComparator o1, EmplyoeeComparator o2) {
				int diff=o2.getId()-o1.getId();
				
				return diff;
			}
			
	
			
		}
		Arrays.sort(arr,new Demo());
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		 
		class Demo2 implements Comparator<EmplyoeeComparator>{

			@Override
			public int compare(EmplyoeeComparator o1, EmplyoeeComparator o2) {
               int  diff=(o1.getName()).compareTo(o2.getName());
				
				
				return diff;
			}
			
			
		}
		Arrays.sort(arr, new Demo2());
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);}
		
	}

}
