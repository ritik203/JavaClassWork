package com.Generic;

public class GenericDemo1 {

	private Object obj;

	public Object getObject() {
		return obj;
	}

	public void setObject(Object obj) {
		this.obj = obj;
	}

public static void main(String[] args) {

	GenericDemo1 g = new GenericDemo1();
	g.setObject(new Double(3.14));
	Double r1 = (Double) g.getObject();
	System.out.println("r1 = "  + r1);

}
}
