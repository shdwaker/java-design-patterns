package com.lanhuigu.design.proxy.demo1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author yihonglei
 * @version 1.0.0
 * @ClassName: MyRemoteImpl
 * @Package: com.lanhuigu.design.proxy.demo1
 * @date 2018/3/25 10:01
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException{

    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, Hey";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
