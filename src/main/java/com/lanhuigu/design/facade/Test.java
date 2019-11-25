package com.lanhuigu.design.facade;

/**
 * Client负责调用facade,facade负责分派任务，SubSystemClass负责执行facade分派的任务
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: Test
 * @Package: com.lanhuigu.design.facade.demo1
 * @date 2018/3/19 16:19
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
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
