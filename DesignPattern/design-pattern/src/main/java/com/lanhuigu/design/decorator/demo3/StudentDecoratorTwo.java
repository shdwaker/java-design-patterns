package com.lanhuigu.design.decorator.demo3;

/**
 * 具体装饰: 第二类学生，不抽烟
 * @author yihonglei
 * @ClassName: StudentDecoratorTwo
 * @Package: com.lanhuigu.design.decorator.demo3
 * @date 2018/5/8 12:08
 * @version 1.0.0
 */
public class StudentDecoratorTwo extends Decorator{
    @Override
    public void study() {
        super.study();
        smoking();
    }

    private void smoking() {
        System.out.println("不抽烟");
    }
}
