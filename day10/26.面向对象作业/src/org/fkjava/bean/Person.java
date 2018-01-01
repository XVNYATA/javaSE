package org.fkjava.bean;

/**
 * 1.写一个类，使用abstract修饰类
定义一些抽象方法，交给子类实现
定义一些非抽象的方法，是所有子类共用的方法实现，并且把方法声明成final的
 * */
public abstract class Person {
	
	private String name;

	// 非抽象方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// final的方法
	public final void info(){
		System.out.println("我是疯狂软件的学员");
	}
	
	// 抽象的打招呼方法
	public abstract void sayHello();

}
