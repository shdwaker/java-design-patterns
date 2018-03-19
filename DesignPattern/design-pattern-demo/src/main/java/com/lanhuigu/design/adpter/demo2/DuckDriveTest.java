package com.lanhuigu.design.adpter.demo2;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: DuckDriveTest
 * @Package: com.lanhuigu.design.adpter.demo2
 * @date 2018/3/19 12:22
 */
public class DuckDriveTest {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
