package com.lanhuigu.design.adpter.demo3;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 新旧集合迭代器兼容适配器
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: EnumerationIterator
 * @Package: com.lanhuigu.design.adpter.demo3
 * @date 2018/3/19 16:01
 */
public class EnumerationIterator implements Iterator {
    private Enumeration enume;

    public EnumerationIterator(Enumeration enume) {
        this.enume = enume;
    }

    @Override
    public boolean hasNext() {
        return enume.hasMoreElements();
    }

    @Override
    public Object next() {
        return enume.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer action) {
        throw new UnsupportedOperationException();
    }
}
