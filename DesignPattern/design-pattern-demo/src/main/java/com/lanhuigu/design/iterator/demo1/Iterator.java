package com.lanhuigu.design.iterator.demo1;

/**
 * 抽象迭代器
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: Iterator
 * @Package: com.lanhuigu.design.iterator
 * @date 2018/3/21 10:37
 */
public interface Iterator {
    Object next();

    void first();

    void last();

    boolean hasNext();
}
