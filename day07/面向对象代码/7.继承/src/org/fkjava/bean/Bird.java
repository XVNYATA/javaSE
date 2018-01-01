package org.fkjava.bean;

public class Bird extends Animal {
	
	private boolean fly;

	public Bird() {
		System.out.println("Bird 构造器");
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}
	
	@Override
	public void shout(){
		System.out.println("吱吱......");
	}
	

}
