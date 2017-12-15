package com.jlac.designpatterns.simplefactory;

public class NYStyleCheesePizza extends Pizza {
	
	public NYStyleCheesePizza() {
		super();
		setName("NY Style Sauce and Cheese Pizza");
		setDough("Thin Crust Dough");
		setSauce("Marinara Sauce");
		getToppings().add("Grated Reggiano Cheese");
	}

}
