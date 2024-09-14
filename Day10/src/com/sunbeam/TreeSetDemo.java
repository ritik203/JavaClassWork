package com.sunbeam;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] argt) {

		TreeSet<String>t=new TreeSet<String>();
		
		t.add("America");
		t.add("China");
		t.add("Bankok");
		t.add("China");
		t.add("India");
		t.add("Pakistan");
		t.add("Russia");
		t.add("Uganda");
		t.add("Afganisthan");
		t.add("India");
		t.add("China");
		
//		System.out.println(t.first());
//		System.out.println(t.last());
		
//		System.out.println(t.toString());
		
		
//		System.out.println(t.headSet("Russia"));
//		System.out.println(t.tailSet("China"));
		
//		System.out.println(t.subSet("China","Russia"));
		
		
		Iterator<String> tr=t.descendingIterator();
		while(tr.hasNext()) {
		String  e=tr.next();
		System.out.print(e+" ");
		}
//		Iterator<String> tr=t.descendingIterator();
//		
		
	}

}
