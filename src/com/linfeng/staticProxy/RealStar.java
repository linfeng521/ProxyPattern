package com.linfeng.staticProxy;

public class RealStar implements Star{

	@Override
	public void sing() {
		System.out.println("I'm a sing sing .....beacuse i'm a realstar");
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("really, i love you,zhonglian");
	}

}
