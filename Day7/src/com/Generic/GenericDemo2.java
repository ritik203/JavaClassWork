package com.Generic;

public class GenericDemo2<T extends Number> {
private Object obj;
	public Object getObj() {
	return obj;
}

public void setObj(Object obj) {
	this.obj = obj;
}

	public static void main(String[] args) {
		
	GenericDemo2<Double> g =new GenericDemo2<Double>();
	g.setObj(new Double(3.14));
	Double r1 = (Double)g.getObj();
	System.out.println("r1 = " + r1);
		

	}

}
