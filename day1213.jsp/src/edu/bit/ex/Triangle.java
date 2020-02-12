package edu.bit.ex;

public class Triangle {	
	double width, height;
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double triangleArea() {
		return width*height*0.5;
	}	
}
