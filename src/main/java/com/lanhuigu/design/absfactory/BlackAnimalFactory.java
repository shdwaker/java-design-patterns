package com.lanhuigu.design.absfactory;

/**
 * 创建'黑色动物'的具体实现工厂
 * @author yihonglei
 * @date 2018/9/6 21:21
 */
public class BlackAnimalFactory implements IAnimalFactory {
    @Override
    public ICat createCat() {
        return new BlackCat();
    }

    @Override
    public IDog createDog() {
        return new BlackDog();
    }
}
