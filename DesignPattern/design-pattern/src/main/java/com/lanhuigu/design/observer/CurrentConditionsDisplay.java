package com.lanhuigu.design.observer;
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temprature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temprature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temprature = temprature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("CurrentConditionsDisplay:" + 
				temprature + "F degress and " + humidity + "% humidity!");
	}

}
