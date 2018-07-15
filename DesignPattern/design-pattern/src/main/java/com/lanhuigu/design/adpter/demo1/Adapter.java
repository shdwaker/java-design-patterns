package com.lanhuigu.design.adpter.demo1;

/**
 * 适配器: 将被适配类Adaptee与目标接口Adapter进行适配
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter (Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void adapteeMethod() {
        adaptee.adapteeMethod();
    }

    @Override
    public void adapterMethod() {
        System.out.println("目标接口的方法");
    }
}
