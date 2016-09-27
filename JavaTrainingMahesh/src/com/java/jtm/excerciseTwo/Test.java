package com.java.jtm.excerciseTwo;

public class Test {

	public static void main(String[] args) {

		Quadrilateral quad = new Rectangle(10f, 5f);
		System.out.println("Area of Rectangle is " + quad.calculateArea());

		Quadrilateral quad1 = new Parallelogram(8f, 6f);
		System.out.println("Area of Parallelogram is " + quad1.calculateArea());
		
		Quadrilateral quad2 = new Rectangle(5f, 5f);
		System.out.println("Area of Sqaure is " + quad2.calculateArea());
	}

}
