package com.lanhuigu.design.adpter.demo4;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: AdapterSocket
 * @Package: com.lanhuigu.design.adpter.demo4
 * @date 2018/5/8 11:55
 */
public class AdapterSocket implements ThreeSocketTarget{
    private TwoSocket twoSocket;

    public AdapterSocket(TwoSocket twoSocket) {
        this.twoSocket = twoSocket;
    }

    @Override
    public void wantThreeSocket() {
        twoSocket.adapteeMethod();
    }
}
