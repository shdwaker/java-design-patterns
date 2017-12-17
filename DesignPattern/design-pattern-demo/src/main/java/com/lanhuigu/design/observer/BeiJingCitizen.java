package com.lanhuigu.design.observer;
/**
 * 目标具体实现
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
