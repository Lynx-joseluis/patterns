package com.jlac.designpatterns.simplefactory;

public class NYStyleVeggiePizza extends Pizza {
	
	public NYStyleVeggiePizza() {
		super();
		setName("NY Style Veggie Pizza");
		setDough("Thin Crust Dough");
		setSauce("Al pesto Sauce");
		getToppings().add("Oregan");
	}

}
