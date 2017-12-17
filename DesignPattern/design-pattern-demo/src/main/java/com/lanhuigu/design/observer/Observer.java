package com.lanhuigu.design.observer;
/**
 * 观察者
 */
public interface Observer {
	
	void update(float temp, float humidity, float pressure);
	
}
