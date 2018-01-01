package org.fkjava.bean;

public class Test {

	public static void main(String[] args) {
		// 接口(父类)  引用  = 子类实例
		A a = new B();
		B b = new B();
		
		TestA t = new TestA();
		
		// 传递的是B的实例
		t.test(a);
		t.test(b);
		

	}

}
