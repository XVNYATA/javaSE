package org.fkjava.bean;

public class Animal {
	
	private String name;
	private String sex;
	private int age;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
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

	public void shout(){
		System.out.println("嗷嗷......");
	}

}
