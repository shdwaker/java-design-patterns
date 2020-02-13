package com.jpeony.design.patterns.decorator.demo3;

/**
 * 抽象装饰: 持有一个构件
 * @author yihonglei
 * @ClassName: Decorator
 * @Package: com.lanhuigu.design.decorator.demo3
 * @date 2018/5/8 12:04
 * @version 1.0.0
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public abstract class Decorator implements Person{
    protected Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void study() {
        person.study();
    }
}
