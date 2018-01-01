package org.fkjava.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		// 声明一个List集合，只能存储String类型的数据
		ArrayList<String> list1 = new ArrayList<String>();
		// 声明一个List集合，只能存储Integer类型的数据
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		// 输出结果 class java.util.ArrayList
		System.out.println(list1.getClass());
		System.out.println(list2.getClass());
		// true
		System.out.println(list1.getClass() == list2.getClass());
		
		// 输出结果说明两个ArrayList的类型是一直，并没有生成存储String的ArrayList和存储Integer的ArrayList
		
		
		list1.add("javase");
		list1.add("android");
		// 编译出错
//		list1.add(100);
		/**
		 * 使用"反射"证明ArrayList<String> 里面可以存储任何类型的数据
		 * */
		try {
			Class c = list1.getClass();
			Method m = c.getDeclaredMethod("add", Object.class);
			Integer i = 100;
			m.invoke(list1, i);
			User u1 = new User(1,"jack","男",20);
			m.invoke(list1, u1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(list1);

	}

}
