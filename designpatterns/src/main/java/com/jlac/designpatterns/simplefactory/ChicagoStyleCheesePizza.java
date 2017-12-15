package com.jlac.designpatterns.simplefactory;

public class ChicagoStyleCheesePizza extends Pizza {
	
	public ChicagoStyleCheesePizza() {
		super();
		setName("Chicago Style Sauce and Cheese Pizza");
		setDough("Extra Thick Crust Dough");
		setSauce("Plum Tomato Sauce");
		getToppings().add("Shredded Mozzarella Cheese");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into * square * slices");
	}

}
