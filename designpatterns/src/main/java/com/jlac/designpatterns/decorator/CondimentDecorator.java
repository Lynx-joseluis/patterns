package com.jlac.designpatterns.decorator;

/*
 * Again this could be an interface rathen than an abstract class, but for sake of having a realistic example (i.e. we
 * inherited an existing code that we need to reimplement using Decorator pattern, we keep this code as it is)
 */
public abstract class CondimentDecorator extends Beverage {

	/**
	 * We reimplement this method as abstract because we want tha the concrete decorators changes the way to
	 * return the description (see the implementation of those classes and you'll see why) 
	 */
	public abstract String getDescription();
}
