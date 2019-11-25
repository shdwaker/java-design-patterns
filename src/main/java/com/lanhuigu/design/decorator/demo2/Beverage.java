package com.lanhuigu.design.decorator.demo2;

/**
 * Component: 定义一个组件，准备接受动态添加职责。
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
