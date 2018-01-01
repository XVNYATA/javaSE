package org.fkjava.bean;

/*
 *  javabean的规范
 *  1. 类必须是公共的，并且有意义的(不是abstract)
 *  2. 字段必须私有
 *  3. 提供对应的set和get方法
 *  4. 必须提供无参数构造器
 */
// Class 类
public class User {
	
	// Field 字段
	private String name;
	private String sex;
	private int age;
	
	// boolean 字段
	private boolean fly;
	
	// Constructor 构造器
	public User(){
		
	}

	// set和get是特殊的方法   称为property 属性
	// 标准的setXXX方法必须传入一个参数，赋值；标准的get方法是没有参数的
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getSex(){
		return this.sex;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	
	// 注意，boolean的set和get方法
	public void setFly(boolean fly){
		this.fly = fly;
	}
	public boolean isFly(){
		return this.fly;
	}
	
	// Method 方法
	public void sayHello(){
		
	}
	
}




