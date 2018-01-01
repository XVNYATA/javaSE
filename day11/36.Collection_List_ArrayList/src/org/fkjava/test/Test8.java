package org.fkjava.test;

import java.util.ArrayList;
import java.util.List;

public class Test8 {

	public static void main(String[] args) {
		// 创建一个ArrayList集合对象
		List list = new ArrayList();
		// 创建3个User对象
		User u1 = new User(1,"jack","男",23);
		System.out.println(u1);
		// 把3个对象添加到集合
		/**
		 * 集合添加对象时是添加对象的引用还是内存地址?
		 * 正确：1. 在集合中有一个引用指向u1指向的内存地址
		 * 错误：2. 将u1指向的内存拷贝到集合当中，则u1和集合中的u1不一样
		 * */
		list.add(u1);
		System.out.println(list);
		// 取出List集合中的第一个元素,此时，有3个引用指向new出来的User对象
		User u2 = (User)list.get(0);
		System.out.println(u2);
		System.out.println(u1 == u2);
		u2.setName("tom");
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(list);
		// 一个对象被垃圾回收的前提是：没有引用指向它，并且不存在集合当中
		u1 = null;
		u2 = null;
		list.remove(0);
		

	}

}
