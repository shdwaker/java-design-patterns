package com.jpeony.design.patterns.template.demo1;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: ConcreteTemplate
 * @Package: com.lanhuigu.design.template.demo1
 * @date 2018/3/20 11:34
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class ConcreteTemplate extends Template {
    @Override
    public void print() {
        System.out.println("子类实现打印方法");
    }
}
