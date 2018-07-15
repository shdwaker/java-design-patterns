package com.lanhuigu.design.decorator.demo1;

public class Test {
    public static void main(String[] args) {
        Man man = new Man();
        ManDecoratorOne oneMan = new ManDecoratorOne();
        ManDecoratorTwo twoMan = new ManDecoratorTwo();

        oneMan.setPerson(man);
        twoMan.setPerson(man);

        oneMan.eat();
        twoMan.eat();
    }
}
