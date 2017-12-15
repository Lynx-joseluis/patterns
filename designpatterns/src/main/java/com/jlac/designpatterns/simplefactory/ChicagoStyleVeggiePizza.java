package com.jlac.designpatterns.simplefactory;

public class ChicagoStyleVeggiePizza extends Pizza {
	
	public ChicagoStyleVeggiePizza() {
		super();
		setName("Chicago Veggie Pizza");
		setDough("Extra Thick Crust Dough");
		setSauce("Mushrooms and Tomato Sauce");
		getToppings().add("Thyme");
	}

	public void cut() {
		System.out.println("Cutting the pizza into * square * slices");
	}
}
