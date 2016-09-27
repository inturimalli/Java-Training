package com.java.jtm.exerciseOne;

public class Test {

	public static void main(String[] args) {

		// Calling static method
		System.out.println("Circle Area using static method = "
				+ Circle.calculateArea(7));

		// Creation of Object
		Circle cir = new Circle(3);
		System.out.println("Circle Area = " + cir.calculateArea());
		System.out.println("Circle Circumference = "
				+ cir.calculateCircumference());
		System.out.println("Circle Diameter = " + cir.calculateDiameter());

	}

}
