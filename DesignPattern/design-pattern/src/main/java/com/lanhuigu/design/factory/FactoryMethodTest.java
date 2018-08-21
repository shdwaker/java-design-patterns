package com.lanhuigu.design.factory;
/**
 * 工厂方法模式应用程序测试，通过工厂创建具体产品对象。
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class FactoryMethodTest {
    // main
    public static void main(String[] args) {
        StudentWorkFactory studentWorkFactory = new StudentWorkFactory();
        studentWorkFactory.getWork().doWork();

        TeacherWorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getWork().doWork();
    }
}
