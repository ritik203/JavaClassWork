package com.shape;
import java.util.Scanner;

public class Program {
	
	
	
	public static int menuList() {
		Scanner sc=new Scanner(System.in);
		System.out.println("0.exit");
		System.out.println("1.Circle");
		System.out.println("2.Rectangle");
	
		return sc.nextInt();
		
	}

	public static void main(String[] args) {
		
		int n;
		while((n=menuList())!=0) 
		
		{
			Shape s=null;
			switch (n) {
            case 1:
            	s=new Cricle();
				
				break;
            case 2:
            	s=new Rectangle();
	
            	break;

			default:
				break;
			}
			
		
			if(s!=null) {
				
				
				s.acceptRecord();
				
				s.calArea();
				s.printRecord();
				
				
			}
			}
		
		
		
		
		
		

	}

}
