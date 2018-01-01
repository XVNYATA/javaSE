package org.fkjava.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	/**
	 * 存储简单数据
	 * */
	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
		// 父类  引用 =  new  子类实例();
		List list = new ArrayList();
		// 如果此列表中没有元素，则返回 true
		boolean isEmpty = list.isEmpty();
		// 返回此列表中的元素数。
		int size = list.size();
		System.out.println("list中有没有元素：" + isEmpty);
		System.out.println("list的元素数量：" + size);
				
		// add 将指定的元素添加到此列表的尾部。
		list.add("javase"); // 0
		list.add("javaee"); // 1
		list.add("android"); // 2
		list.add("android"); // 3
		list.add(null); // 4 允许空元素
		list.add(100); // 存储int时会发生自动装箱，转成Integer 
		// 输出 [javase, javaee, android, android, null, 100]
		// 说明ArrayList类覆盖了父类的toString()方法
		System.out.println(list);
		// 将指定的元素插入此列表中的指定位置。
		list.add(1, "iOS");
		System.out.println(list);
		
		List list2 = new ArrayList();
		list2.add("jack");
		list2.add("rose");
		
		// 将该 collection 中的所有元素添加到此列表的尾部
		list.addAll(list2);
		System.out.println(list);
		
		// 再次调用方法，判断list集合的
		isEmpty = list.isEmpty();
		size = list.size();
		System.out.println("list中有没有元素：" + isEmpty);
		System.out.println("list的元素数量：" + size);
		
		// 移除此列表中的所有元素。
		list.clear();
		
		isEmpty = list.isEmpty();
		size = list.size();
		System.out.println("list中有没有元素：" + isEmpty);
		System.out.println("list的元素数量：" + size);
		System.out.println(list);
		

	}

}
