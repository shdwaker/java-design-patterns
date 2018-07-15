package com.lanhuigu.design.observer.demo1;
/**
 * 观察者
 */
public interface Observer {
	
	void update(float temp, float humidity, float pressure);
	
}
