package com.lanhuigu.design.factory.demo1;

public class FactoryMethodTest {
    //main
    public static void main(String[] args) {
        StudentWorkFactory studentWorkFactory = new StudentWorkFactory();
        studentWorkFactory.getWork().doWork();

        TeacherWorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getWork().doWork();
    }
}
