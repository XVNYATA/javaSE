package org.fkjava.test;

import java.util.ArrayList;
import java.util.List;

public class Test4 {

	/**
	 *  遍历List集合
	 * */
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("javase"); // 0
		list.add("javaee"); // 1
		list.add("android"); // 2
		list.add("Oracle"); // 3
		list.add("iOS"); // 4
		
		/**
		 * 1. 简单的for循环
		 * */
		for(int i = 0;i < list.size();i++){
			Object obj = list.get(i);
			System.out.println(obj);
		}
		System.out.println("----------------------");
		/**
		 * 2. forEach循环
		 * */
		for(Object obj : list){
			System.out.println(obj);
		}
		System.out.println("----------------------");
		/**
		 * 3. forEach循环
		 *    使用Java8的Lambda表达式遍历
		 * */
		list.forEach((obj)->{
			System.out.println(obj);
		});
		System.out.println("----------------------");
		// 如果只有一个形参，可以省略小括号，如果方法体只有一句代码，可以省略大括号
		list.forEach(obj -> System.out.println(obj));
	}

}
