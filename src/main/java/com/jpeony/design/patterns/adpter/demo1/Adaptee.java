package com.jpeony.design.patterns.adpter.demo1;

/**
 * 已经存在，具有特殊功能，但是不符合我们已经存在的标准接口
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class Adaptee {
    public void adapteeMethod() {
        System.out.println("将要被适配的类");
    }
}
