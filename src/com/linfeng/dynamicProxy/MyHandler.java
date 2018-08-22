package com.linfeng.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {
	//维护一个目标对象
	Star star = new RealStar();
	public MyHandler(Star star) {
		this.star = star;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("sing")) {
			System.out.println("事务开启");
			/**
			   参数：
				obj - 从中调用底层方法的对象
				args - 用于方法调用的参数 
				返回：使用参数 args 在 obj 上指派该对象所表示方法的结果 
				即调用star.[method.getName()](args);
			*/
			method.invoke(star, args);
			System.out.println("事务关闭");
		}
		if(method.getName().equals("say")) {
			System.out.println(method.getName()+"in proxy");
			String word = (String) method.invoke(star, args);
			System.out.println("被代理对象返回值 in proxy　process"+word);
		}
		return null;
	}
	

}
