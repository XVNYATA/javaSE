package org.fkjava.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {
		List list = new Vector();
		list.add("javase"); // 0
		list.add("javaee"); // 1
		list.add("android"); // 2
		
		//  按适当顺序（从第一个到最后一个元素）返回包含此列表中所有元素的数组。
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));

	}

}
