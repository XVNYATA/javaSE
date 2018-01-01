package org.fkjava.test;

import java.util.HashSet;
import java.util.Set;

public class Test1 {

	/**
	 * 存储简单数据
	 * */
	public static void main(String[] args) {
		// 创建一个HashSet对象
		Set<String> set = new HashSet<String>();
		// 添加数据，保存时候无序
		set.add("javase");
		set.add("android");
		set.add("iOS");
		
		System.out.println(set);

	}

}
