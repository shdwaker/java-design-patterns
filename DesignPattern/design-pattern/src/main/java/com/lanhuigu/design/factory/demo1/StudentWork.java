package com.lanhuigu.design.factory.demo1;

/**
 * @ClassName: StudentWork
 * @Description: 实现接口对象为具体对象
 */
public class StudentWork implements Work{

    @Override
    public void doWork() {
        System.out.println("学生做作业");
    }
}
