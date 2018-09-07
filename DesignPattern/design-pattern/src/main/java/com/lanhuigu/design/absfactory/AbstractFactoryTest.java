package com.lanhuigu.design.absfactory;

/**
 * 抽象工厂测试类
 * @author yihonglei
 * @date 2018/9/7 11:22
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        // 白色动物
        IAnimalFactory whiteAnimalFactory = new WhiteAnimalFactory();
        ICat whiteCat = whiteAnimalFactory.createCat();
        whiteCat.eat();
        IDog whiteDog = whiteAnimalFactory.createDog();
        whiteDog.eat();

        // 黑色动物
        IAnimalFactory blackAnimalFactory = new BlackAnimalFactory();
        ICat blackCat = blackAnimalFactory.createCat();
        blackCat.eat();
        IDog blackDog = blackAnimalFactory.createDog();
        blackDog.eat();

    }
}
