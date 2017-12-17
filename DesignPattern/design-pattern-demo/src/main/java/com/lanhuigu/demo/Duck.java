package com.lanhuigu.demo;

public abstract class Duck {
	
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	
	public String performQuack() {
		return quackBehavior.quack();
	}
	
	public String performFly() {
		return flyBehavior.fly();
	}
	
	public String swim() {
		return "All ducks float, even decoys!";
	}

	public abstract String display();
	
}
