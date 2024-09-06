package com.interfacedemo;

public interface Printable {
  int num=2;
	void print();
	
}
class Demo implements Printable{

	@Override
	public void print() {
		System.out.println("num is "+num);
		
	}
	
	
}

