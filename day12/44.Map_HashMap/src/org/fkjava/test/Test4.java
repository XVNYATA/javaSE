package org.fkjava.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test4 {

	/**
	 * 测试遍历HashMap
	 * */
	public static void main(String[] args) {
		// 创建一个HashMap对象，key是Integer，value是String
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "javase");
		map.put(2, "iOS");
		map.put(3, "oracle");
		map.put(4, "mysql");
		// key不允许重复，但是value是可以重复的
		map.put(5, "mysql");
		
		// 简洁的写法，直接获取keySet去遍历
		for(Integer key : map.keySet()){
			System.out.println(key + " = " + map.get(key));
		}
		
	}

}
