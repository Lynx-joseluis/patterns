package com.jlac.designpatterns.simplefactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	
	private String name;
	private String dough;
	private String sauce;
	private List<String> toppings = new ArrayList<String>();

	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
		System.out.println(" " + toppings.get(i));
		}
		
	}

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");		
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");		
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the dough
	 */
	public String getDough() {
		return dough;
	}

	/**
	 * @return the sauce
	 */
	public String getSauce() {
		return sauce;
	}

	/**
	 * @return the toppings
	 */
	public List<String> getToppings() {
		return toppings;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param dough the dough to set
	 */
	public void setDough(String dough) {
		this.dough = dough;
	}

	/**
	 * @param sauce the sauce to set
	 */
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	/**
	 * @param toppings the toppings to set
	 */
	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}

	
}
