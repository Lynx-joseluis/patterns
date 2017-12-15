package com.jlac.designpatterns.decorator;

public class Main {

	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		
		System.out.println(" ================== ");
		
		Beverage beverage4 = new HouseBlend();
		beverage4 = new Frappuccino(beverage4);
		System.out.println(beverage4.getDescription() + " $" + beverage4.cost());
		
		Beverage beverage5 = new HouseBlend();
		beverage5 = new Frappuccino(beverage2); // Notar el uso de "beverage2" en lugar de "beverage5"
		System.out.println(beverage5.getDescription() + " $" + beverage5.cost());
		
		//
		
		Beverage beverage6 = new DarkRoast();
		beverage6 = new Whip(beverage6);
		System.out.println(beverage6.getDescription() + " $" + beverage6.cost());
	}

}
