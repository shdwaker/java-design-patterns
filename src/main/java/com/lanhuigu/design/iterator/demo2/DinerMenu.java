package com.lanhuigu.design.iterator.demo2;

import java.awt.*;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: DinerMenu
 * @Package: com.lanhuigu.design.iterator.demo2
 * @date 2018/3/21 14:18
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfIterms = 0;
    MenuItem[] menuItems;

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
