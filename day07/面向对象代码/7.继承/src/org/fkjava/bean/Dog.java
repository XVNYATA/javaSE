package org.fkjava.bean;

public class Dog extends Animal {

	public Dog() {
		this("旺财","公",2); // 调用Dog的有参数构造器
	
	}

	public Dog(String name, String sex, int age) {
		super(name, sex, age);
		
	}
	
	

}
