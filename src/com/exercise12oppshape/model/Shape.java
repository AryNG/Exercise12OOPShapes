package com.exercise12oppshape.model;

public abstract class Shape implements Shapeable{

	@Override
	public String Draw() {
		return "Figure is being drawn";
	}

	@Override
	public String ChangeColor() {
		return "Figure's colors are being change";
	}

	@Override
	public String Erase() {
		return "Figure is being erase";
	}

	@Override
	public double CalculateArea() {
		return 0;
	}

	@Override
	public double CalculatePerimeter() {
		return 0;
	}
	

}
