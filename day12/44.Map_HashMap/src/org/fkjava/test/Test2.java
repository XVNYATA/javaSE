package org.fkjava.test;

import java.util.HashMap;
import java.util.Map;

public class Test2 {

	/**
	 * 测试HashMap取数据
	 * */
	public static void main(String[] args) {
		// 创建一个HashMap对象，key是Integer，value是String
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "javase");
		map.put(2, "iOS");
		map.put(3, "oracle");
		map.put(4, "mysql");
		
		String s1 = map.get(1);
		System.out.println(s1);
		
		String s2 = map.get(9);
		System.out.println(s2);
		
		// 是否包含key
		boolean f1 = map.containsKey(3);
		System.out.println(f1);
		boolean f2 = map.containsValue("oracle");
		System.out.println(f2);
		boolean f3 = map.containsValue("spring");
		System.out.println(f3);
		
		

	}

}
