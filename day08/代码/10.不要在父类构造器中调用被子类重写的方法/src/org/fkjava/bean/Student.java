package org.fkjava.bean;

public class Student extends Person {
	
	private String name;

	public Student() {
		super();
		System.out.println("Student()");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello(){
		System.out.println(this.name.length());
	}

}
