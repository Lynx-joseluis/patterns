package com.jlac.designpatterns.decorator;

public class Frappuccino extends CondimentDecorator {
	
	private Beverage beverage;

	public Frappuccino(Beverage beverage) {
		this.beverage = beverage;
		}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Ice";

	}

	@Override
	public double cost() {
		return 0.15 + beverage.cost();
	}

}
