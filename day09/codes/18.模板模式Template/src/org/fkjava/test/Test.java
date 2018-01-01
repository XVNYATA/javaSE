package org.fkjava.test;

import org.fkjava.bean.Employee;
import org.fkjava.bean.Student;

public class Test {

	public static void main(String[] args) {
		// 创建子类实例
		Student s = new Student();
		// 调用方法
		s.test();
		System.out.println();
		// 创建子类实例
		Employee e = new Employee();
		// 调用方法
		e.test();
	}

}
