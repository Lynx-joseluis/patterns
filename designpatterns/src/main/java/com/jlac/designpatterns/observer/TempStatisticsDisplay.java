package com.jlac.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class TempStatisticsDisplay implements Observer, DisplayElement {

	private WeatherData weatherData;
	private List<Float> temperatures = new ArrayList<Float>();

	public TempStatisticsDisplay(WeatherData weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void display() {
		float sum = sumTemperatures();
		float avgTemp = sum / temperatures.size();
	
		System.out.println("Avg temperature: " + avgTemp + " of # " + temperatures.size() + " measuraments");
	}

	private float sumTemperatures() {
		float sum = 0;
		
		for(Float t : temperatures) {
			sum += t;
		}

		return sum;
	}

	public void update(float temp, float humidity, float pressure) {
		temperatures.add(temp);
		display();
	}

}
