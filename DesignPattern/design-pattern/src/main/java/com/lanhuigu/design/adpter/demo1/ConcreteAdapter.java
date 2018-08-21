package com.lanhuigu.design.adpter.demo1;

/**
 * 适配器: 将被适配类Adaptee与目标接口Adapter进行适配
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class ConcreteAdapter implements Adapter {

    private Adaptee adaptee;

    public ConcreteAdapter(Adaptee adaptee) {
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
