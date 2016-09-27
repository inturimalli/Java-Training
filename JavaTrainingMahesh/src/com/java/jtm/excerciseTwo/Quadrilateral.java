package com.java.jtm.excerciseTwo;

public class Quadrilateral {
	
	float length;
	float bredth;
	
	public Quadrilateral(){
	}
	public Quadrilateral(float length, float bredth){
		this.length = length;
		this.bredth = bredth;
	}
	
	public float calculateArea(){
		float area = this.length * this.bredth;
		System.out.println("Area from Quadrilateral class is " + area);
		return area;
	}
}
