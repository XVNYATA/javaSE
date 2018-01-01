package org.fkjava.test;

import org.fkjava.bean.Person;

public class Test4 {

	// 测试getClass
	public static void main(String[] args) {
		Person p1 = new Person("周杰伦","男",32);
		Person p2 = new Person("周杰伦","男",32);
		System.out.println(p1.getClass());
		System.out.println(p2.getClass());
		System.out.println(p1.getClass() == p2.getClass());

	}

}
