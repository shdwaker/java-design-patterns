package com.lanhuigu.demo;

public class RedheadDuck extends Duck{
	
	public RedheadDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "红头鸭子";
	}

}
