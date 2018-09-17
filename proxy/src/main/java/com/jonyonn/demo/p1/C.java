package com.jonyonn.demo.p1;

public class C {
	public void c() {
		System.out.println("添加功能1");
		B b = new B(); 
		b.b();
		System.out.println("添加功能2");
	}
	
	
	public static void main(String[] args) {
		C c = new C();
		c.c();
	}
}
