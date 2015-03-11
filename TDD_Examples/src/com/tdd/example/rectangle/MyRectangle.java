package com.tdd.example.rectangle;

public class MyRectangle {
	
	private double length;
	private double width;

	public MyRectangle(double length, double width){
		this.length = length;
		this.width=width;
	}
	
	public double getPerimeter(){
		return 2*(length+width);
	}
	
	public double getArea(){
		return length*width;
	}
	

}
