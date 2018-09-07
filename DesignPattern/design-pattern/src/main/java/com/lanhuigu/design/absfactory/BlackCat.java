package com.lanhuigu.design.absfactory;

/**
 * 猫类产品具体实现--黑猫
 * @author yihonglei
 * @date 2018/9/6 21:23
 */
public class BlackCat implements ICat {
    @Override
    public void eat() {
        System.out.println("黑猫--吃东西");
    }
}
