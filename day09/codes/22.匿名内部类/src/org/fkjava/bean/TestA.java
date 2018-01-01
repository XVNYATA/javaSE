package org.fkjava.bean;

public class TestA {

	/**
	 参数是A接口，传递的必须是A接口的实现类
	 面向接口编程，参数越抽象越好
	 test(Person p)  Person是接口
	 方法可以接收Man和WoMan做为参数
	 
	 test(Man m) Man是Person接口的子类
	 方法只能接收Man作为参数
	 */
	public void test(A a){
		// 调用接口的方法
		a.play();
	}
	
}
