package com.sunbeam;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateDireDemo {

	public static void main(String[] args) throws IOException {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter path of Directory");
		String p=sc.nextLine();
		
		
		File file=new File(p);
//		boolean success=file.mkdir();// creating directary
		boolean status=file.createNewFile();
		System.out.println("Directary"+status);
		
		
		
		
		
	}

}
