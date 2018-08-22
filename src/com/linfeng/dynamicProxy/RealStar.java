package com.linfeng.dynamicProxy;

public class RealStar implements Star{

	@Override
	public void sing() {
		System.out.println("I'm a sing sing ..FSFS...");
	}

	@Override
	public String say(String str) {
		//System.out.println("i want to say:"+str);
		return "i want to say:"+str;
	}

}
