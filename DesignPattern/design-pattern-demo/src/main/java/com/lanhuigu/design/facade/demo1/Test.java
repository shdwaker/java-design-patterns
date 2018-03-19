package com.lanhuigu.design.facade.demo1;

/**
 * Client负责调用facade,facade负责分派任务，SubSystemClass负责执行facade分派的任务
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: Test
 * @Package: com.lanhuigu.design.facade.demo1
 * @date 2018/3/19 16:19
 */
public class Test {
    public static void main(String[] args) {
        SwitchFacade facade = new SwitchFacade();

        /*
         * Client
         */
        facade.open();
        System.out.println("=======================");
        facade.off();
    }
}
