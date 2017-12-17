package com.lanhuigu.demo;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "绿头鸭子";
	}

}
