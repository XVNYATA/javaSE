package org.fkjava.test;

import java.util.HashSet;
import java.util.Set;

public class Test5 {

	/**
	 * 存储对象
	 * */
	public static void main(String[] args) {
		// 创建一个HashSet，只能存储User类型的对象
		Set<User> set = new HashSet<User>();
		// 存数据
		set.add(new User(1,"java","男",20));
		set.add(new User(2,"rose","女",18));
		User u3 = new User(3,"tom","男",25); 
		User u4 = new User(3,"tom","男",25); 
		// 没有覆盖equals和hashcode的时候，比较都是false
		/*System.out.println("(u3 == u4) ：" + (u3 == u4)); // false
		System.out.println("(u3.hashCode() == u4.hashCode()) ：" + (u3.hashCode() == u4.hashCode())); // false
		System.out.println("u3.equals(u4)：" + u3.equals(u4)); // false
*/		set.add(u3);
		// 存储重复数据
		set.add(u4);
		
		for(User u : set){
			System.out.println(u);
		}

	}

}
