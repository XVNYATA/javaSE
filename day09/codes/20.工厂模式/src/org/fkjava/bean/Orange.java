package org.fkjava.bean;

public class Orange extends Fruit {

	public Orange() {
		super();
		setName();
	}

	@Override
	public void setName() {
		this.name = "Orange";

	}

}
