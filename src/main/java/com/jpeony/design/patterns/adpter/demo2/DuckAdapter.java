package com.jpeony.design.patterns.adpter.demo2;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: DuckAdapter
 * @Package: com.lanhuigu.design.adpter.demo2
 * @date 2018/3/19 13:04
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class DuckAdapter implements Turkey {
    Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
