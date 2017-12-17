package com.lanhuigu.design.observer;
/**
 * 主题
 * 注册、删除、通知
 */
public interface Subject {
	
	void registerObserver(Observer o);
	
	void removeObserver(Observer o);
	
	void notifyObservers();
	
}
