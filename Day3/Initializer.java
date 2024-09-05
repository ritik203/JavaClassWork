package com.sunbeam;

public class Initializer {
	
	private int num1=12;//field initialzer
	private int num2;
	private int num3;
	private int num4=111;
	
	
	public Initializer(){ // constructor highest prioirty then object initialer then field initilzer..
		this.num1=50;
		this.num2=50;

		
		
		
	}
	{
		this.num3=90;
		this.num4=15;
		
		
		
		
	}
	public void dissplay() {
//		System.out.printf("num1:%d num2:%d"+num2+"num3:%d"+num3+"num4:%d"+num4);
		System.out.printf("num1 : %d num2 :%d num3 :%d num4: %d",num1,num2,num3,num4);
		
	}
	
	

	public static void main(String[] args) {
		Initializer i=new Initializer();
		i.dissplay();
		
		

	}

}
