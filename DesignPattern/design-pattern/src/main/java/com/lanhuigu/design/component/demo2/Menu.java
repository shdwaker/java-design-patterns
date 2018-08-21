package com.lanhuigu.design.component.demo2;

import com.lanhuigu.design.iterator.demo2.Iterator;

import java.util.ArrayList;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: Menu
 * @Package: com.lanhuigu.design.component.demo2
 * @date 2018/3/21 21:15
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(ArrayList menuComponents, String name, String description) {
        this.menuComponents = menuComponents;
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println("--------------");
        Iterator iterator = (Iterator) menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }

}
