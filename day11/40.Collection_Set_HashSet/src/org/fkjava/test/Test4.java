package org.fkjava.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test4 {

	/**
	 * 取数据
	 * */
	public static void main(String[] args) {
		// 创建一个HashSet对象
		Set<Integer> set = new HashSet<Integer>();
		// 添加数据，保存时候无序
		set.add(1);
		set.add(3);
		set.add(5);
		// 重复数据，set集合不会存储
		set.add(5);
		set.add(null);
		// 重复数据，set集合不会存储
		set.add(null);
		
		System.out.println(set);
		
		

	}

}
