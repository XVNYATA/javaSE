package org.fkjava.test;

import org.fkjava.bean.Person;

public class Test {

	public static void main(String[] args) {
		Person p = new Person();
		// 访问Person类的name字段
		p.name = "jack";
		// 不能访问 protected 只有当前包，当前类和子类可以访问
//		p.sex = "男";
		// 不能访问 默认权限 只有当前包，当前类可以访问
//		p.age = 20;
		// 访问不了，私有权限，只有当前类可以访问
//		p.address = "gz";
		System.out.println(p.name);

	}

}
