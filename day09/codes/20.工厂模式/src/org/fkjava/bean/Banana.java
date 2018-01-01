package org.fkjava.bean;

public class Banana extends Fruit {

	public Banana() {
		super();
		setName();
	}

	@Override
	public void setName() {
		this.name = "Banana";

	}

}
