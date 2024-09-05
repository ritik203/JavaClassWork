package com.sunbeam;

public class Singleton {
	 public static Singleton obj;
	 
	static{
		obj=new Singleton();
		 
	 }
	public static Singleton getSingleton() {
		return Singleton.obj;
	}
	
	
	private Singleton(){
		Singleton.obj=obj;
		
	}
	
	

	public static void main(String[] args) {

		
	    Singleton s1=Singleton.getSingleton();
	    Singleton s2=Singleton.getSingleton();
	    
	    if(s1==s2) {
	    	System.out.println("true");
	    }else {
	    	System.out.println("true");
	    }
		
		
	}

}
