package com.lanhuigu.design.iterator.demo2;

import java.awt.*;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: DinerMenuIterator
 * @Package: com.lanhuigu.design.iterator.demo2
 * @date 2018/3/21 13:58
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
