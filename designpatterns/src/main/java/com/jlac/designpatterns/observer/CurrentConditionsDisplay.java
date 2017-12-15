package com.jlac.designpatterns.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private Object temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		display();

	}

}
