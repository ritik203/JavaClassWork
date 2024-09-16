package com.sunbeam;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class FilesDemo {
	public static void main(String[] args) {
		
		
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter path file ");
	String path=sc.nextLine();
	
	File file =new File(path);
	
	if(!file.exists()) {
		System.out.println("File doen't exits");
		System.exit(0);
	}
	
	if(file.isDirectory()) {
		System.out.println("Searching for files inside directry");
		
		String[] list=file.list();
		for (String name : list) {
			System.out.println(name);
		}
		
	}
	else if(file.isFile()) {
		System.out.println("File info");
		System.out.println("parent name is "+file.getParent());
	System.out.println("name is "+ file.getName());
	
	System.out.println("File permissions");
	
	if(file.canRead()) {
		System.out.println("read");
	}
	if(file.canExecute()) {
		System.out.println("can execute");
	}
	if(file.canWrite()) {
		System.out.println("Can write");
	}
	
	}
	
		
		
	}

}
