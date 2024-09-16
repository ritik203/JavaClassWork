package com.sunbeam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ActuadataDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source path file");
		String src = sc.nextLine();
		System.out.println("Enter Destination Path file");
		String des = sc.nextLine();
		
		int b;
		try (FileInputStream fin=new FileInputStream(src)){
			try(FileOutputStream fout=new FileOutputStream(des)){
				while((b=fin.read())!=-1) {
					fout.write(b);
					
				}
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("File copied: ");
	
	}

}
