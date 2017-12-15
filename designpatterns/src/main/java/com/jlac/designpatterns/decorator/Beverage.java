package com.jlac.designpatterns.decorator;

/*
 * This could be an interface rathen than an abstract class, but for sake of having a realistic example (i.e. we
 * inherited an existing code that we need to reimplement using Decorator pattern, we keep this code as it is)
 */
public abstract class Beverage {
	
	public String description = "Unknown beverage";

	public String getDescription() {
		return description;
	}
	
	public abstract double cost();

}
