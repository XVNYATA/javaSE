package org.fkjava.test;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		// 定义了一个List集合，该集合只能存储String类型的数据。
		List<String> list = new ArrayList<String>();
		// 存储String的数据
		list.add("javase");
		list.add("android");
		// 返回的一定是String数据，不在需要强制类型转换
		String s = list.get(0);

		// forEach循环的时候可以直接声明String类型
		for(String t : list){
			System.out.println(t);
		}

	}

}
