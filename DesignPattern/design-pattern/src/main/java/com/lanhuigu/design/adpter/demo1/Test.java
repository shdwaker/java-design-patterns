package com.lanhuigu.design.adpter.demo1;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: Test
 * @Package: com.lanhuigu.design.adpter
 * @date 2018/3/19 10:48
 */
public class Test {
    public static void main(String[] args) {
        // 被适配器类
        Adaptee adaptee = new Adaptee();
        // 标准接口
        Target target = new Adapter(adaptee);
        // Adptee 与 Adapter两个无关的类协同工作
        target.adapteeMethod();
        target.adapterMethod();
    }
}
