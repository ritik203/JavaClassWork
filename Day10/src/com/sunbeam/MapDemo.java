package com.sunbeam;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(12,"America");
		map.put(10,"Usa");
		map.put(11,"Dubai");
		map.put(15,"China");
		map.put(17,"Japan");
		map.put(9,"Pakistan");
		System.out.println(map.toString());
		
		
//		
//		Scanner sc=new Scanner(System.in);
//		int pin=sc.nextInt();
//		System.out.println("enter value");
//		String area=map.get(pin);

	}

}
