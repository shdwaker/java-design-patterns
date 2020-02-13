package com.jpeony.design.patterns.decorator.demo1;
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
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
