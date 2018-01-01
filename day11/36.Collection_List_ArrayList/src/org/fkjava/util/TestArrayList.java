package org.fkjava.util;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("javase"); // 0
		list.add("javaee"); // 1
		list.add("android"); // 2

		for(int i = 0;i < list.size();i++){
			Object obj = list.get(i);
			System.out.println(obj);
		}
		
		System.out.println(list);
		
	}

}
