package com.sunbeam;

public interface Shape {

	double calcArea();
	
	default double calPeri() {
		return 0.0;
	};
	
	
	
	
	
}
