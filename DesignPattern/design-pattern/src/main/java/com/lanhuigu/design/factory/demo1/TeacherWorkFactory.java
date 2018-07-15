package com.lanhuigu.design.factory.demo1;

/**
 * @ClassName: TeacherWorkFactory
 * @Description: 子类从工厂中实例化老师工作对象
 */
public class TeacherWorkFactory implements IWorkFactory {
    @Override
    public Work getWork() {
        return new TeacherWork();
    }
}
