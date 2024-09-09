package com.sunbeam;

public class Program {

	public static void main(String[] args) {
      
		
		A a=new A();
		a.show();
		a.showRecord();
		a.printRecord();
		
		B b=new B();
		b.show();
		b.display();
		b.printRecord();
		
		A a1=new B();
		a1.show();
		a1.showRecord();
		a1.printRecord();
		
		B b1=(B)a1;
		
		b1.display();
		b1.printRecord();
		b1.showRecord();
		
		
		
		
		
	}	
		
		
	}

