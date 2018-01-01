package org.fkjava.util;

import java.util.ArrayList;
import java.util.List;

public class TestFkList {

	public static void main(String[] args) {
		FKArrayList list = new FKArrayList();
		list.add("javase"); // 0
		list.add("javaee"); // 1
		list.add("android"); // 2
		list.add("Oracle"); // 3
		list.add("iOS"); // 4

		for(int i = 0;i < list.size();i++){
			Object obj = list.get(i);
			System.out.println(obj);
		}

		System.out.println(list);
	}

}
