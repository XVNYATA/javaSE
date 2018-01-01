package org.fkjava.test;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

	/**
	 * 测试HashMap存储数据
	 * */
	public static void main(String[] args) {
		// 创建一个HashMap对象，key是Integer，value是String
		Map<Integer, String> map = new HashMap<Integer, String>();
		System.out.println("isEmpty() = " + map.isEmpty()); // true
		
		// put就是存储数据，返回的是保存的key的旧值，如果没有旧值，返回null
		String v = map.put(1, "javase");
		// 如果put的时候key是已经存在的，会覆盖
		String s = map.put(1, "android");
		System.out.println(v);
		System.out.println(s);
		
		map.put(2, "iOS");
		map.put(8, "oracle");
		map.put(3, "mysql");
		
		System.out.println("isEmpty() = " + map.isEmpty()); // false
		System.out.println(map.size()); // 4
		System.out.println(map);
		
		// 删除key是1的"映射"
		map.remove(1);
		System.out.println(map);
		
		map.clear(); // 清空
		
		System.out.println(map);

	}

}
