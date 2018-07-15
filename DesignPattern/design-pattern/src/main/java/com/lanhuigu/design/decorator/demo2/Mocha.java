package com.lanhuigu.design.decorator.demo2;

/**
 * ConcreteDecorator: 装饰者，负责给被装饰者添加新行为。
 */
public class Mocha extends CondimentDecorator {

    @Override
    public String getDescription() {
        return super.getBeverage().getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 20 + super.getBeverage().cost();
    }
}
