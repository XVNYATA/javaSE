package org.fkjava.bean;

// final 修饰的类是最终类，不能再被继承
public final class Person {
	//  1.直接在声明变量的时候赋值。
	private static final String clazz = "j1604";
	private static final String school;

	// 注意：使用static和final一起修饰变量，该变量称为常量
	// 标准语法
	private static final String USERNAME = "admin";
	
	// 1.声明的时候直接赋值。
	private final String name = "jack";
	private final String sex;
	private final Integer age; 
	
	static{
		// 2.在使用静态代码块，给变量赋值。
		school = "fkjava";
	}
	
	// 动态实例代码块
	{
		// 2.使用非静态代码块给变量赋值。
		sex = "男";
	}
	public Person(){
		// 3.使用构造器给变量赋值。
		this.age = 20;
	}
	
	public void play(){
		// 报错，final修饰的变量不能被修改
//		this.name = "a";
	}
	
}
