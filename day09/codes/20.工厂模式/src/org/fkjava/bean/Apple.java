package org.fkjava.bean;

public class Apple extends Fruit {
	
	public Apple() {
		super();
		setName();
	}

	@Override
	public void setName() {
		this.name = "Apple";
	}

}
