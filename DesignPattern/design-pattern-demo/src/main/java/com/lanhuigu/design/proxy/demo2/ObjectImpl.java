package com.lanhuigu.design.proxy.demo2;

/**
 * RealSubject: 被代理的实现类
 */
public class ObjectImpl implements Object {
    @Override
    public void action() {
        System.out.println("======被代理的类ObjectImpl======");
    }
}
