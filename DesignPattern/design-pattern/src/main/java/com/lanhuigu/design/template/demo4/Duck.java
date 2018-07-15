package com.lanhuigu.design.template.demo4;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: Duck
 * @Package: com.lanhuigu.design.template.demo4
 * @date 2018/3/20 19:57
 */
public class Duck implements Comparable {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object object) {
        Duck otherDuck = (Duck) object;
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }

}
