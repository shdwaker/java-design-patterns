package com.lanhuigu.demo;

public class ModelDuck extends Duck{
	
	public ModelDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "I'm a model duck";
	}

}
