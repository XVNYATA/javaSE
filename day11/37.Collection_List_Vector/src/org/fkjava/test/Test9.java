package org.fkjava.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Test9 {

	public static void main(String[] args) {
		// 创建的是ArrayList，线程不安全
//		List list = new ArrayList();
		List list = new ArrayList();
		// 将list转成一个线程安全的List
		list = Collections.synchronizedList(list);
		list.add("javase"); // 0
		list.add("javaee"); // 1
		list.add("android"); // 2

	}

}
