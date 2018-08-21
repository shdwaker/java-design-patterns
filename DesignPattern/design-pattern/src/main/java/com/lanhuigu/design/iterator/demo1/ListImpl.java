package com.lanhuigu.design.iterator.demo1;

/**
 * 具体聚合类
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: ListImpl
 * @Package: com.lanhuigu.design.iterator
 * @date 2018/3/21 10:47
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class ListImpl implements List {
    private Object[] list;
    private int index;
    private int size;

    public ListImpl() {
        index = 0;
        size = 0;
        list = new Object[100];
    }

    @Override
    public Iterator iterator() {
        return new IteratorImpl(this);
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void add(Object obj) {
        list[index++] = obj;
        size ++;
    }
}
