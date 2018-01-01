package org.fkjava.bean;

public enum Gender2 {

	MALE("男"),FEMALE("女");
	// 定义一个private final修饰的实例变量
	private final String name;

	// 私有构造器
	private Gender2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
