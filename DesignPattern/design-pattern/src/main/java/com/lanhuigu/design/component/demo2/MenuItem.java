package com.lanhuigu.design.component.demo2;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: MenuItem
 * @Package: com.lanhuigu.design.component.demo2
 * @date 2018/3/21 20:01
 */
public class MenuItem extends MenuComponent{
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(" " + getName());
        if (isVegetarian()) {
            System.out.println("(V)");
        }
        System.out.println(", " + getPrice());
        System.out.println("--" + getDescription());
    }
}
