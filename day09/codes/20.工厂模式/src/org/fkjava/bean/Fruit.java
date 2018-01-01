package org.fkjava.bean;

public abstract class Fruit {

	// protected修饰的变量在子类可以访问
	protected String name;
	
	public Fruit() {
		super();
		
	}
	
	public String getName() {
		return name;
	}

	// 抽象方法，设置水果的名称
	public abstract void setName();
	
	

}
