package com.exercise12oppshape.model;

public class Square extends Shape{
//Characteristics------------------------------------------------------------------------------------------------
	private double side;
//Constructors---------------------------------------------------------------------------------------------------
	public Square() {}
	public Square(double side) {
		this.side=side;
	}
//Process--------------------------------------------------------------------------------------------------------
	public double CalculateArea(double side) {
		return side*side;
	}
	public double CalculatePerimeter(double side) {
		return side*4;
	}
//Getters and Setters--------------------------------------------------------------------------------------------
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
}
