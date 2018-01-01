package org.fkjava.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test3 {

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
		
		// 获得所有映射的key的集合
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		
		// 遍历key的集合
		for(Integer key : keySet){
			// 通过key调用get方法取值
			String value = map.get(key);
			System.out.println(key + " = " + value);
		}
		
		// 获得所有的value
		Collection<String> values = map.values();
		System.out.println(values);
		
	}

}
