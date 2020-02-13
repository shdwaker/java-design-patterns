package com.jpeony.design.patterns.component.demo2;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: MenuComponent
 * @Package: com.lanhuigu.design.component.demo2
 * @date 2018/3/21 19:57
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public abstract class MenuComponent {
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegeratian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }
}
