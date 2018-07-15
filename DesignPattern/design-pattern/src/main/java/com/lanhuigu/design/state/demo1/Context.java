package com.lanhuigu.design.state.demo1;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: Context
 * @Package: com.lanhuigu.design.state
 * @date 2018/3/24 16:54
 */
public class Context {
    private Weather weather;

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public String weatherMessage() {
        return weather.getWeather();
    }
}
