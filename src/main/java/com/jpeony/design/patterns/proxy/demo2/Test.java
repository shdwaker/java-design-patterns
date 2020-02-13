package com.jpeony.design.patterns.proxy.demo2;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: Test
 * @Package: com.lanhuigu.design.proxy.demo2
 * @date 2018/3/25 16:58
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class Test {
    public static void main(String[] args) {
        // 通过代理对象访问真实对象
        ProjectProxy pr = new ProjectProxy();
        pr.action();
    }
}
