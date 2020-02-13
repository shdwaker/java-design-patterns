package com.jpeony.design.patterns.proxy.demo2;

/**
 * RealSubject: 被代理的实现类
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class ObjectImpl implements Object {
    @Override
    public void action() {
        System.out.println("======被代理的类ObjectImpl======");
    }
}
