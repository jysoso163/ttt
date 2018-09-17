package com.jonyonn.demo.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyProxy  implements MethodInterceptor{

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("代理前");
		arg3.invokeSuper(arg0, arg2);
		System.out.println("代理后");
		return null;
	}

}
