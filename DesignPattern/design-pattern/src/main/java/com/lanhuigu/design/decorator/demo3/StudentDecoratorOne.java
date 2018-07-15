package com.lanhuigu.design.decorator.demo3;

/**
 * 具体装饰: 第一类学生，抽烟
 * @author yihonglei
 * @ClassName: StudentDecoratorOne
 * @Package: com.lanhuigu.design.decorator.demo3
 * @date 2018/5/8 12:06
 * @version 1.0.0
 */
public class StudentDecoratorOne extends Decorator {
    @Override
    public void study() {
        super.study();
        smoking();
        System.out.println("========================");
    }

    private void smoking() {
        System.out.println("抽烟");
    }
}
