package org.fkjava.test;

import org.fkjava.bean.Person;

public class Test {

	// 测试toString方法
	public static void main(String[] args) {
		Person p = new Person("周杰伦","男",32);
		// org.fkjava.bean.Person@15db9742
		System.out.println(p);
		
		Person p2 = new Person("蔡依林","女",29);
		System.out.println(p2);

	}

}
