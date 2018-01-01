package org.fkjava.test;

import org.fkjava.bean.Student;

public class Test {

	// 测试静态变量
	public static void main(String[] args) {
		// name每一个对象会分配一次内存保存name，而静态变量clazz不管多少个对象都只分配一次内存
		Student s1 = new Student();
		s1.setName("张三");
		Student s2 = new Student();
		s2.setName("李四");

	}

}
