package com.jpeony.design.patterns.adpter.demo2;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: TurkeyDriveTest
 * @Package: com.lanhuigu.design.adpter.demo2
 * @date 2018/3/19 13:09
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class TurkeyDriveTest {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        DuckAdapter duckAdapter = new DuckAdapter(duck);

        duckAdapter.gobble();
        duckAdapter.fly();
    }
}
