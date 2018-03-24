package com.lanhuigu.design.template.demo1;

/**
 * AbstractClass: 定义抽象的原语操作，具体的子类将重定义它们，将实现一个算法的各个步骤。
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: Template
 * @Package: com.lanhuigu.design.template.demo1
 * @date 2018/3/20 11:28
 */
public abstract class Template {

    public void update() {
        System.out.println("******begin******");
        for (int i = 0; i < 10; i++) {
            print();
        }
        System.out.println("******end******");
    }

    public abstract void print();
}
