package com.jonyonn.demo.cglib;


import net.sf.cglib.proxy.Enhancer;

public class Test {

	public static void main(String[] args) throws InterruptedException {
			MyProxy m = new MyProxy();
			
			Enhancer e = new Enhancer();
			e.setCallback(m);
			e.setSuperclass(ServiceImpl.class);
			ServiceImpl create = (ServiceImpl) e.create();
			create.show();
			
		
	}
}
