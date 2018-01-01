package org.fkjava.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test5 {

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
		
		// {1=javase[entry], 2=iOS, 3=oracle, 4=mysql, 5=mysql}
		System.out.println(map);
		
		/**
		 * entrySet()方法返回的结果是一个Set集合
		 * Set集合里面保存的是多个Entry，没有Entry包括key和value
		 * */
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		// 遍历entrySet
		for(Map.Entry<Integer, String> entry : entrySet){
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
	
	}

}
