package org.fkjava.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test7 {

	/**
	 * 测试ArrayList保存自定义对象
	 * */
	public static void main(String[] args) {
		// 创建一个ArrayList集合对象
		List list = new Vector();
		// 创建3个User对象
		User u1 = new User(1,"jack","男",23);
		User u2 = new User(2,"rose","女",18);
		User u3 = new User(3,"tom","男",25);
		// 把3个对象添加到集合
		list.add(u1);
		list.add(u2);
		list.add(u3);
		// 遍历
		for(int i = 0;i < list.size();i++){
			// 获得每一个元素
			Object obj = list.get(i);
			// 强转
			User user = (User)obj;
			// 打印
			System.out.println(user);
		}
		

	}

}
