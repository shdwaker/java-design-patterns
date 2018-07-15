package com.lanhuigu.design.template.demo2;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: Tea
 * @Package: com.lanhuigu.design.template.demo2
 * @date 2018/3/20 11:43
 */
public class Tea extends CaffeineBevergeAbstract{

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void pourInCup() {
        System.out.println("Adding Lemon");
    }

}
