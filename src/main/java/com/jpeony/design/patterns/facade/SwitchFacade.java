package com.jpeony.design.patterns.facade;

/**
 * Facade: 外观核心，负责处理客户端的请求给合适的子系统对象
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: SwitchFacade
 * @Package: com.lanhuigu.design.facade.demo1
 * @date 2018/3/19 16:15
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class SwitchFacade {
    /** 外观模式所有遇到的组件都放在这里 */
    LightService ls;
    TelevisionService ts;

    public SwitchFacade() {
        // TODO Auto-generated constructor stub
        ls = new LightServiceImpl();
        ts = new TelevisionServiceImpl();
    }

    public void open() {
        ls.openLight();
        ts.openTelevision();
    }

    public void off() {
        ls.offLight();
        ts.offTelevision();
    }
}
