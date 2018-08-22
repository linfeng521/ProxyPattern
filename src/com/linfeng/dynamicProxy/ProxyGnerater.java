package com.linfeng.dynamicProxy;

public class ProxyGnerater implements Star {
	//维护一个目标对象
	private Star star;
	//执行相关方法之前, 调用Handler中的方法
	public void sing() {
		//myHandler.invoke();
	}
	
	public void cry() {
		//myHandler.invoke();
		
	}

	@Override
	public String say(String str) {
		//myHandler.invoke();
		return null;
	}
}
