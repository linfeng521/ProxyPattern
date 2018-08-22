package com.linfeng.staticProxy;



public class StarProxy implements Star{
	private Star star;
	public StarProxy(Star star) {
		this.star = star;
	}
	@Override
	public void sing() {
		System.out.println("填写合同......");
		star.sing();
		System.out.println("收取尾款");
		
	}
	@Override
	public void say() {
		System.out.println("下面有请我们的发言人进行发言");
		star.say();
		
	}
	
	
}
