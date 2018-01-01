package org.fkjava.test;

import org.fkjava.bean.Person;

public class Test3 {

	// 测试hashcode
	public static void main(String[] args) {
		Person p1 = new Person("周杰伦","男",32);
		Person p2 = new Person("周杰伦","男",32);
		System.out.println(p1.getName().hashCode());
		System.out.println(p2.getName().hashCode());

	}

}
