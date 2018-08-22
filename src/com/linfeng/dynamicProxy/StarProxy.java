package com.linfeng.dynamicProxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class StarProxy {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Star star = new RealStar();
		MyHandler handler = new MyHandler(star);
		/**
		*动态代理类Proxy（以下简称为代理类）是一个实现在创建类时在运行时指定的接口列表的类，该类具有下面描述的行为。 
		*代理接口 是代理类实现的一个接口。 
		*代理实例 是代理类的一个实例。 每个代理实例都有一个关联的调用处理程序 对象，它可以实现接口 InvocationHandler。
		*通过其中一个代理接口的代理实例上的方法调用将被指派到实例的调用处理程序的 Invoke 方法，
		*并传递代理实例、识别调用方法的 java.lang.reflect.Method 对象以及包含参数的 Object 类型的数组。
		*调用处理程序以适当的方式处理编码的方法调用，并且它返回的结果将作为代理实例上方法调用的结果返回。 
		 */

		 // 给目标对象，创建代理对象
		//事件处理,执行目标对象的方法时,会触发事件处理器的方法,会把当前执行目标对象的方法作为参数传入
		Star proxy = (Star)Proxy.newProxyInstance(Star.class.getClassLoader(), new Class[] {Star.class}, handler);
		
		System.out.println(proxy.getClass().getMethod("say", String.class));
		System.out.println(proxy.getClass().getMethod("sing"));
		Method method = proxy.getClass().getMethod("sing");
		method.invoke(proxy);
		System.out.println("==================================");
		//proxy.sing();
		//----->通过对代理接口的代理实例上方法调用将被指派到MyHandler中的Invoke方法. 
		//    并传递代理实例参数, 识别调用方法的Method对象以及阐述的Object类型数组
		//    invoke中适当方法进行处理(包装了对实际目标对象的方法访问即代理). 
		//	   返回Object作为代理实例上方法调用的结果返回
		proxy.say("hello world");	
		proxy.sing();
	}
}
/**
 * 
 */
 
