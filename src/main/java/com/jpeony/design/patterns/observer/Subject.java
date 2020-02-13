package com.jpeony.design.patterns.observer;
/**
 * 主题
 * 注册、删除、通知
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public interface Subject {
	
	void registerObserver(Observer o);
	
	void removeObserver(Observer o);
	
	void notifyObservers();
	
}
