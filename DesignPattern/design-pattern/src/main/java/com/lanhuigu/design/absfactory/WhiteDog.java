package com.lanhuigu.design.absfactory;

/**
 * 狗类产品的具体实现--白狗
 * @author yihonglei
 * @date 2018/9/6 21:23
 */
public class WhiteDog implements IDog {
    @Override
    public void eat() {
        System.out.println("白狗--吃东西");
    }
}
