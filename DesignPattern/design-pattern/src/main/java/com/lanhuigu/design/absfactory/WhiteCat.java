package com.lanhuigu.design.absfactory;

/**
 * 猫类产品具体实现--白猫
 * @author yihonglei
 * @date 2018/9/6 21:24
 */
public class WhiteCat implements ICat {
    @Override
    public void eat() {
        System.out.println("白猫--吃东西");
    }
}
