package com.lanhuigu.design.decorator.demo1;

/**
 * ConcreteComponent: 实现Person接口，将要接受添加自责的对象类
 */
public class Man implements Person{
    @Override
    public void eat() {
        System.out.println("男人吃完饭");
    }
}
