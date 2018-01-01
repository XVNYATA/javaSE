package org.fkjava.bean;

public class Test {

	public static void main(String[] args) {
		Person p = new Person();
		// 访问Person类的name字段
		p.name = "jack";
		// protected 当前包可以访问
		p.sex = "男";
		// 默认权限  当前包可以访问
		p.age = 20;
		// 访问不了，私有权限，只有当前类可以访问
//		p.address = "gz";
		System.out.println(p.name + " " + p.sex + " " + p.age);

	}

}
