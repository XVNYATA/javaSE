package org.fkjava.bean;

// 动物  父类
public class Animal {
	
	private String name;
	private String sex;
	private int age;
	
	protected String color;
	
	public Animal() {
		System.out.println("Animal 构造器");
	}
	
	public Animal(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat(){
		System.out.println("吃");
	}
	
	// 叫
	public void shout(){
		System.out.println("啊啊......");
	}
	
	public void run(){
		System.out.println("父类的run方法......");
	}

}
