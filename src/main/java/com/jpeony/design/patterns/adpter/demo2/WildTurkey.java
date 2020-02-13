package com.jpeony.design.patterns.adpter.demo2;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: WildTurkey
 * @Package: com.lanhuigu.design.adpter.demo2
 * @date 2018/3/19 12:02
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
