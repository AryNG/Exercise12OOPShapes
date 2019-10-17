package com.exercise12oppshape.model;
import java.lang.Math;
public class Circle extends Shape{
//Characteristics------------------------------------------------------------------------------------------------
	private double radio;
//Constructors---------------------------------------------------------------------------------------------------
	public Circle() {}
	public Circle(double radio) {
		this.radio=radio;
	}
//Process--------------------------------------------------------------------------------------------------------
	public double CalculateArea(double radio) {
		return Math.PI*(Math.pow(radio, 2));
	}
	public double CalculatePerimeter(double radio) {
		return 2*Math.PI*radio;
	}
//Getters and setters--------------------------------------------------------------------------------------------
	public double getRadio() {
		return radio;
	}
	public void setRadio(double radio) {
		this.radio=radio;
	}
}
