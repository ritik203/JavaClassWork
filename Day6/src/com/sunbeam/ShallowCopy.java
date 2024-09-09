package com.sunbeam;

public class ShallowCopy implements Cloneable {
	
	private int day;
	private int month; 
	private int year;
	private DeepCopy dip;

	
	public ShallowCopy(int day, int month, int year, String name,int num) {
		
		this.day = day;
		this.month = month;
		this.year = year;
		this.dip = DeepCopy(name,num);
	}
	
	public void setDay(int day) {
		this.day=day;
	}
	public int getDay() {
		return day; 
	}
	
	public void setMonth(int month) {
		this.month=month;
	}
	public int getMonth() {
		return month; 
	}
	public void setYear(int year) {
		this.year=year;
	}
	public int getYear() {
		return year; 
	}
	public String toString() {
		
		return "day: "+day+"month : "+month+"year : "+year;
	}
	
	
	
	

	public static void main(String[] args) {
		
	ShallowCopy s=new ShallowCopy(12,12,1212,"ritik",12);
	ShallowCopy s1=s;
	
	System.out.println(s.toString());
	System.out.println(s1.toString());
	
		
		
		
		
		
	}

}
