package com.lanhuigu.design.state.demo1;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: Test
 * @Package: com.lanhuigu.design.state.demo1
 * @date 2018/3/24 16:56
 */
public class Test {
    public static void main(String[] args) {
        Context ctx1 = new Context();
        ctx1.setWeather(new Sunshine());
        System.out.println(ctx1.weatherMessage());

        Context ctx2 = new Context();
        ctx2.setWeather(new Rain());
        System.out.println(ctx2.weatherMessage());
    }
}
