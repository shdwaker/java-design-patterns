package com.jpeony.design.patterns.adpter.demo4;

/**
 * @author yihonglei
 * @ClassName: Test
 * @Package: com.lanhuigu.design.adpter.demo4
 * @date 2018/5/8 11:56
 * @version 1.0.0
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class Test {
    public static void main(String[] args) {
        // 被适配类
        TwoSocket twoSocket = new TwoSocket();

        // 适配器类
        ThreeSocketTarget three = new AdapterSocket(twoSocket);

        // 调用希望的三孔插座，适配器将2孔转化为了客户端希望的3孔插座
        three.wantThreeSocket();
    }
}
