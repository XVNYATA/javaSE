package org.fkjava.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test5 {

	/**
	 *  遍历List集合
	 *  使用迭代器遍历
	 *  
	 *  循环和迭代的区别？
	 * */
	public static void main(String[] args) {
		List list = new Vector();
		list.add("javase"); // 0
		list.add("javaee"); // 1
		list.add("android"); // 2
		list.add("Oracle"); // 3
		list.add("iOS"); // 4
		
		// 获得当前的List集合的迭代器
		Iterator it = list.iterator();
		// hasNext()如果仍有元素可以迭代，则返回 true。
		while(it.hasNext()){
			// it.next()返回迭代的下一个元素。
			Object o = it.next();
			System.out.println(o);
		}
		System.out.println("--------------");
		/**
		 * javase
			javaee
			android
			Oracle
			iOS
		 * 
		while(it.hasNext()){
			// it.next()返回迭代的下一个元素。
			Object o = it.next();
			// 注意，如果再次调用next()方法，相当于在一个判断中调用了两次
			System.out.println(it.next());
		}*/
		
		
		
		
		/*// 判断是否还有下一个元素,如果有返回true
		boolean f = it.hasNext();
		// 获取下一个元素
		Object o = it.next();
		System.out.println(f);
		System.out.println(o);
		// 判断是否还有下一个元素,如果有返回true
		boolean f1 = it.hasNext();
		// 获取下一个元素
		Object o1 = it.next();
		System.out.println(f1);
		System.out.println(o1);
		*/

	}

}
