package org.fkjava.test;

import org.fkjava.bean.Student;

public class Test2 {

	// 测试静态方法
	public static void main(String[] args) {
		// 静态方法可以直接访问，不需要new对象
		Student.say();

	}

}
