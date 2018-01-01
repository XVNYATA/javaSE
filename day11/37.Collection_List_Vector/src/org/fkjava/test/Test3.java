package org.fkjava.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test3 {

	/**
	 * 测试ArrayList集合取数据
	 * */
	public static void main(String[] args) {
		List list = new Vector();
		list.add("javase"); // 0
		list.add("javaee"); // 1
		list.add("android"); // 2
		list.add("Oracle"); // 3
		list.add("android"); // 4
		
		// 返回此列表中指定位置上的元素。
		String s = (String)list.get(0);
		System.out.println(s);
		
		// 数组下标越界
//		String s2 = (String)list.get(9);
//		System.out.println(s2);

		// 判断集合中是否包含iOS
		boolean b1 = list.contains("iOS");
		System.out.println("集合中是否包含iOS：" + b1);
		boolean b2 = list.contains("android");
		System.out.println("集合中是否包含android：" + b2);
		
		
		// 返回元素在集合当中的索引下标
		int index1 = list.indexOf("iOS");
		System.out.println("集合中iOS的索引：" + index1);
		int index2 = list.indexOf("android");
		System.out.println("indexOf集合中android的索引：" + index2);
		// 从集合的后面开始查找
		int index3 = list.lastIndexOf("android");
		System.out.println("lastIndexOf集合中android的索引：" + index3);
	
		System.out.println(list);
		// 根据下标删除
		list.remove(1);
		System.out.println(list);
		// 根据元素删除 移除此列表中首次出现的指定元素（如果存在）。
		list.remove("android");
		System.out.println(list);
		
		// 用指定的元素替代此列表中指定位置上的元素。
		list.set(1, "iOS");
		System.out.println(list);
	}

}
