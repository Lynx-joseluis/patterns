package com.jlac.designpatterns.decorator;

public class Espresso extends Beverage {
	
	public Espresso() {
		super();
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
