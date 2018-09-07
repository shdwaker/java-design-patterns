package com.lanhuigu.design.absfactory;

/**
 * 狗类产品的具体实现--黑狗
 * @author yihonglei
 * @date 2018/9/6 21:24
 */
public class BlackDog implements IDog {
    @Override
    public void eat() {
        System.out.println("黑狗--吃东西");
    }
}
