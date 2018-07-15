package com.lanhuigu.design.component.demo2;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: Waitress
 * @Package: com.lanhuigu.design.component.demo2
 * @date 2018/3/21 21:26
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
