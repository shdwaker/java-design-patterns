package com.lanhuigu.design.template.demo2;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: Coffee
 * @Package: com.lanhuigu.design.template
 * @date 2018/3/20 11:12
 */
public class Coffee extends CaffeineBevergeAbstract{

    @Override
    protected void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    protected void pourInCup() {
        System.out.println("Adding Sugar and Milk");
    }

}
