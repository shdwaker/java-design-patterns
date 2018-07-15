package com.lanhuigu.design.observer.demo1;
/**
 * 观察者实现
 */
public class BeiJingPoliceman implements Policeman{

	@Override
	public void action(Citizen ci) {
		// TODO Auto-generated method stub
		String help = ci.getHelp();
		if (help.equals("normal")) {
			System.out.println("一切正常，不用出动");
		} else {
			System.out.println("有犯罪行为，马上出动");
		}
	}

}
