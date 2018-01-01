package org.fkjava.test;

import java.util.HashMap;
import java.util.Map;

public class Test6 {

	public static void main(String[] args) {
		// 创建一个HashMap对象，key是Integer，value是User
		Map<Integer, User> map = new HashMap<Integer, User>();
		
		map.put(1, new User(1,"jack","男",20));
		map.put(2, new User(2,"rose","女",21));
		map.put(3, new User(3,"tom","男",22));
		map.put(4, new User(4,"alice","女",23));
		
		// 直接取值
		User u = map.get(2);
		System.out.println(u);
		
		/**
		 * keySet遍历
		 * */
		for(Integer key : map.keySet()){
			User t = map.get(key);
			System.out.println(key + " = " + t);
		}
		System.out.println(" --------------- ");
		/**
		 * entrySet遍历
		 * */
		for(Map.Entry<Integer, User> entry : map.entrySet()){
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		System.out.println(" --------------- ");
		/**
		 * lambda表达式
		 * */
		map.forEach((key,vlaue) ->{
			System.out.println(key + " = " + vlaue);
		});
		
	}

}
