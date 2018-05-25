package com.lanhuigu.design.factory.demo1;

/**
 * @ClassName: IWorkFactory
 * @Description: 定义创建对象的工厂方法--由具体子类实例化对象
 */
public interface IWorkFactory {
    Work getWork();
}
