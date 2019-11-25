package com.lanhuigu.design.proxy.demo1;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: GumballMonitor
 * @Package: com.lanhuigu.design.proxy.demo1
 * @date 2018/3/25 9:19
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        this.machine = machine;
    }

    public void report() {
        System.out.println("Gumball Machine: " + machine.getLocation());
    }
}
