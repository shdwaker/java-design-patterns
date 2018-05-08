package com.lanhuigu.design.decorator.demo3;

/**
 * 具体构件
 * @author yihonglei
 * @ClassName: Student
 * @Package: com.lanhuigu.design.decorator.demo3
 * @date 2018/5/8 12:03
 * @version 1.0.0
 */
public class Student implements Person{

    @Override
    public void study() {
        System.out.println("学生以学习为重任");
    }
}
