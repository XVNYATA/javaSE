package org.fkjava.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test3 {

	/**
	 * 取数据
	 * */
	public static void main(String[] args) {
		// 创建一个HashSet对象
		Set<String> set = new HashSet<String>();
		// 添加数据，保存时候无序
		set.add("javase");
		set.add("android");
		set.add("iOS");
		// 重复数据，set集合不会存储
		set.add("iOS");
		set.add(null);
		// 重复数据，set集合不会存储
		set.add(null);
		
		System.out.println(set);
		
		

	}

}
