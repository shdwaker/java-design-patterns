package com.jpeony.design.patterns.proxy.demo2;

/**
 * 代理角色
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class ProjectProxy implements Object {
    Object obj;

    public ProjectProxy() {
        System.out.println("======代理类ProjectProxy======");
        obj = new ObjectImpl();
    }

    @Override
    public void action() {
        System.out.println("======代理开始======");
        obj.action();
        System.out.println("======代理结束======");
    }
}
