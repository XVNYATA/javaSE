package org.fkjava.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test2 {

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
		
		System.out.println(set);
		
		/**
		 * forEach
		 * */
		for(String s : set){
			System.out.println(s);
		}
		System.out.println("---------------");
		/**
		 * Lambda表达式
		 * */
		set.forEach( t -> System.out.println(t));
		System.out.println("---------------");
		/**
		 * 迭代
		 * */
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}

	}

}
