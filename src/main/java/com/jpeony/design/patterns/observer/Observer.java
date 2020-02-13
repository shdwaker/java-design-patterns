package com.jpeony.design.patterns.observer;
/**
 * 观察者
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public interface Observer {
	
	void update(float temp, float humidity, float pressure);
	
}
