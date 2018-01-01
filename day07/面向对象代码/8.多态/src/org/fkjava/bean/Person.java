package org.fkjava.bean;

public class Person {
	
	private String name;
	
	public String aa = "person";

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void play(){
		System.out.println("play .. ");
	}

}
