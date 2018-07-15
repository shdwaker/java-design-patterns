package com.lanhuigu.design.factory.demo1;

/**
 * @ClassName: StudentWorkFactory
 * @Description: 实例化学生工作对象，返回学生工作对象
 */
public class StudentWorkFactory implements IWorkFactory{
    @Override
    public Work getWork() {
        return new StudentWork();
    }
}
