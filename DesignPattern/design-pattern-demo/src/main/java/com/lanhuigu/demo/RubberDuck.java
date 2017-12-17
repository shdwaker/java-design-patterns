package com.lanhuigu.demo;

public class RubberDuck extends Duck{
	
	public RubberDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "橡皮鸭子";
	}

}
