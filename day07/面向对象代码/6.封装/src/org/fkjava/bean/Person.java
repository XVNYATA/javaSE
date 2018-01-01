package org.fkjava.bean;

// 人 javabean
public class Person {
	
	// 字段全部私有
	private String name;
	private String sex;
	private int age;
	
	// 1. 外界不能访问，只能自己在构造器中赋值
	public Person(){
		System.out.println("无参数构造器");
	}
	
	// 2. 可以暴露一个有参数构造器给外界赋值
	public Person(String name,String sex,int age){
		System.out.println("有参数构造器");
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	// p.setName("jack");
	public void setName(String name){
		this.name = name;
	}
	
	// 返回this.name
	public String getName(){
		// 内部可以访问
		return this.name;
	}
	
	
	

}
