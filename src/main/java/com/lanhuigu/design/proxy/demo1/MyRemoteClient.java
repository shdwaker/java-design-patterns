package com.lanhuigu.design.proxy.demo1;

import java.rmi.Naming;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: MyRemoteClient
 * @Package: com.lanhuigu.design.proxy.demo1
 * @date 2018/3/25 10:04
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class MyRemoteClient {
    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String s = service.sayHello();

            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
