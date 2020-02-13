package com.jpeony.design.patterns.observer;
/**
 * 目标具体实现
 */
/**
 *
 * @author yihonglei
 * @date 2018/8/21 10:20
 */
public class BeiJingCitizen extends Citizen{
	
	public BeiJingCitizen(Policeman pol) {
		// TODO Auto-generated constructor stub
		setPoliceman();
		register(pol);
	}

	@Override
	void sendMessage(String help) {
		// TODO Auto-generated method stub
		setHelp(help);
		for (int i = 0; i < pols.size(); i++) {
			Policeman pol = (Policeman)pols.get(i);
			pol.action(this);
		}
	}

}
