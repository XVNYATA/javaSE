package org.fkjava.test;

import org.fkjava.bean.Student;

public class TestStudent {

	public static void main(String[] args) {
		// 创建对象
		Student s = new Student();
		// 设置名称
		s.setName("jack");
		// 调用父类的final修饰的方法
		s.info();
		// 调用覆盖父类的抽象方法
		s.sayHello();

	}

}
