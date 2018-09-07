package com.lanhuigu.design.absfactory;

/**
 * 声明一个用于创建抽象产品对象的操作接口
 * @author yihonglei
 * @date 2018/9/6 21:10
 */
public interface IAnimalFactory {

    /**
     * 创建猫类抽象产品
     * @author yihonglei
     * @date 2018/9/6 21:17
     */
    ICat createCat();

    /**
     * 创建狗类抽象产品
     * @author yihonglei
     * @date 2018/9/6 21:17
     */
    IDog createDog();

}
