package com.jonyonn.demo.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy  implements InvocationHandler{
	
	private ServiceImpl serviceImpl;
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("前面");
		method.invoke(serviceImpl, args); 
		System.out.println("后面");
		return null;
	}

	public ServiceImpl getServiceImpl() {
		return serviceImpl;
	}

	public void setServiceImpl(ServiceImpl serviceImpl) {
		this.serviceImpl = serviceImpl;
	}
	
	

}
