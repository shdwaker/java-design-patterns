package com.jpeony.design.patterns.adpter.demo1;
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class Client {
    public static void main(String[] args) {
        // 被适配器类
        Adaptee adaptee = new Adaptee();
        // 标准接口
        Adapter adapter = new ConcreteAdapter(adaptee);
        // Adptee 与 Adapter两个无关的类协同工作
        adapter.adapteeMethod();
        adapter.adapterMethod();
    }
}
