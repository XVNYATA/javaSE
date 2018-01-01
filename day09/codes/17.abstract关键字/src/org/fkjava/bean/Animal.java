package org.fkjava.bean;

// 标准的java必须是公共的并且是有意义的(不是抽象的)

// abstract修饰的类叫做抽象类，抽象类是不能创建实例的
public abstract class Animal {
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void eat(){
		
	}
	
	// 抽象方法
	public abstract void shout();

}
