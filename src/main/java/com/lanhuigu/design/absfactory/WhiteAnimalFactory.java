package com.lanhuigu.design.absfactory;

/**
 * 创建'白色动物'的具体实现工厂
 * @author yihonglei
 * @date 2018/9/6 21:19
 */
public class WhiteAnimalFactory implements IAnimalFactory{

    @Override
    public ICat createCat() {
        return new WhiteCat();
    }

    @Override
    public IDog createDog() {
        return new WhiteDog();
    }
}
