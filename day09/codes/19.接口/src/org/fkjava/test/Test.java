package org.fkjava.test;

import org.fkjava.bean.Student;

public class Test {

	public static void main(String[] args) {
		Student s = new Student();
		// 访问父类Person属性
		s.setName("jack");
		System.out.println(s.getName());
		// 调用Study接口方法
		s.read();
		// 调用Play接口的方法
		s.run();

	}

}
