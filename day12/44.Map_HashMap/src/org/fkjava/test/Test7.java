package org.fkjava.test;

import java.util.HashMap;
import java.util.Map;

public class Test7 {

	public static void main(String[] args) {
		// 创建一个HashMap对象，key是User，value是String
		Map<User,String> map = new HashMap<User,String>();
		
		/**
		 *  Map的key不允许重复？如何判断重复？
			     （1）对象的hashcode的值一样。
			     （2）对象的equals返回true。
		 * */
		map.put(new User(1,"jack","男",20),"1");
		map.put(new User(1,"jack","男",20),"2");
		map.put(new User(1,"jack","男",20),"3");
		map.put(new User(1,"jack","男",20),"4");
		
		map.forEach((key,value)->{
			System.out.println(key + " = " + value);
		});
		

	}

}
