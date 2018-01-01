package org.fkjava.bean;

// bean 所有的java类称为javabean
public class Person {
	
	// public 公共权限，在任何地方都可以访问
	public String name;
	
	// protected 受保护的权限,只能在当前包、当前类、子类里面可以访问
	protected String sex; 
	
	// 默认权限 只能在当前包、当前类访问
	int age;
	
	// 私有权限 ，只能在当前类访问
	private String address;
	
	public static void main(String[] args) {
		Person p = new Person();
		// 访问Person类的name字段
		p.name = "jack";
		// protected 当前类可以访问
		p.sex = "男";
		// 默认权限 当前类可以访问
		p.age = 20;
		// 私有权限  当前类可以访问
		p.address = "gz";
		System.out.println(p.name + " " + p.sex + " " + p.age + " " + p.address);
	}

}
