package com.lanhuigu.demo;

public class TestDuck {
	public static void main(String[] args) {
		MallardDuck mallardDuck = new MallardDuck();
		RedheadDuck redheadDuck = new RedheadDuck();
		RubberDuck rubberDuck = new RubberDuck();
		
		System.out.println("mallardDuck.performQuack():" + mallardDuck.performQuack());
		System.out.println("redheadDuck.performQuack():" + redheadDuck.performQuack());
		System.out.println("rubberDuck.performQuack():" + rubberDuck.performQuack());
	
	
		Duck model = new ModelDuck();
		System.out.println("" + model.performFly());
		model.setFlyBehavior(new FlyRocketPowered()); // 动态注入
		System.out.println("" + model.performFly());
	}
}
