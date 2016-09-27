package com.java.jtm.exerciseOne;

public class Circle extends Shape {

	float radius;

	// default constructor
	public Circle() {
	}

	// parameterized constructor
	public Circle(float radius) {
		this.radius = radius;
	}

	// static method calculateArea - provide radius in the method
	public static float calculateArea(float radius) {
		float area = (float) (Math.PI * radius * radius);
		return area;
	}

	// calculateArea - method overriding from Shape class
	public float calculateArea() {
		return (float) (Math.PI * this.radius * this.radius);
	}

	// calculateCircumference
	public float calculateCircumference() {
		float circumference = (float) (2 * Math.PI * this.radius);
		return circumference;
	}

	// calculateDiameter
	public float calculateDiameter() {
		float diameter = (float) (2 * this.radius);
		return diameter;
	}

}
