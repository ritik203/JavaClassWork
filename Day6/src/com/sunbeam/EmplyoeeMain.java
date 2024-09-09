package com.sunbeam;

public class EmplyoeeMain {

	public static void main(String[] args) {

		Employee e=new Employee(10,"abc",100.0);
//		e.setEmpid(10);
//		e.setName("Abc");
//		e.setSalary(100000.0);
		System.out.println(e.toString());
		
	
		
		Employee e1=new Employee(10,"abc",100.0);
//		e1.setEmpid(10);
//		e1.setName("Abc");
//		e1.setSalary(100000.0);
		System.out.println(e1.toString());
		
		System.out.println(e.equals(e1));
		

		
		if(e.equals(e1)) {
			System.out.println("same");
		}else{
			System.out.println(" not same");
		}
		
		
		
		
		
		
		
		
		
	}

}
