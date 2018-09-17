package com.jonyonn.demo.jdkproxy;

import java.lang.reflect.Proxy;

public class Test {
	
	public static void main(String[] args) {
//		IService iService = new ServiceImpl();
//		iService.show();
		ServiceImpl serviceImpl  = new ServiceImpl();
		MyProxy myProxy = new MyProxy();
		myProxy.setServiceImpl(serviceImpl);
		IService iService = (IService) Proxy.newProxyInstance(Test.class.getClassLoader(), new Class[] {IService.class}, myProxy);
		iService.show();
	}
	
}
