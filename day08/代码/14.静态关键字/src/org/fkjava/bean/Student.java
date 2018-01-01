package org.fkjava.bean;

public class Student {
	
	// 静态变量属于类类变量，只会分配一次内存
	public static String clazz = "j1604";
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 静态方法
	public static void say(){
		// 访问静态变量
		System.out.println(clazz);
	}
	

}
