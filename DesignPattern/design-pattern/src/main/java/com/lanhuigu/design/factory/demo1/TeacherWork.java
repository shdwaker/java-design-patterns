package com.lanhuigu.design.factory.demo1;

/**
 * @ClassName: TeacherWork
 * @Description: 实现接口对象为具体对象
 */
public class TeacherWork implements Work {
    @Override
    public void doWork() {
        System.out.println("老师批改作业");
    }
}
