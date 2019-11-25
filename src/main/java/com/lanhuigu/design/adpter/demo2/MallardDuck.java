package com.lanhuigu.design.adpter.demo2;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: MallardDuck
 * @Package: com.lanhuigu.design.adpter.demo2
 * @date 2018/3/19 12:00
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
