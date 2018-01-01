package org.fkjava.test;

import org.fkjava.bean.Person;

public class Test2 {

	// 测试equals方法
	public static void main(String[] args) {
		Person p1 = new Person("周杰伦","男",32);
		Person p2 = new Person("周杰伦","男",32);
		// org.fkjava.bean.Person@15db9742
		System.out.println(p1);
		// org.fkjava.bean.Person@6d06d69c
		System.out.println(p2);
		// 重点： == 判断内存地址
		System.out.println("== :" + (p1 == p2));
		// equals方法判断对象的"内容"是否相等
		// public boolean equals(Object obj)
		System.out.println("equals :" +p1.equals(p2));
		
		
		
		
		
	}

}
