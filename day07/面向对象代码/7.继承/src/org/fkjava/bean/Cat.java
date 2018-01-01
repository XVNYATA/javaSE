package org.fkjava.bean;

/**
 * this关键字，this指向的总是当前对象
 * super关键字,super总是指向作为该方法调用者的子类对象所对应的父类对象Animal。
 * */
public class Cat extends Animal {

	public Cat() {
		super(); // 调用父类无参数构造器
	}
	
	public Cat(String name, String sex, int age) {
		super(name, sex, age); // 调用父类的有参数构造器
	}

	public void run(){
		System.out.println("子类的 run方法");
	}
	
	public void play(){
		// 调用自己的run方法
//		this.run();
		// 调用父类的run方法
		super.run();
	}

}
