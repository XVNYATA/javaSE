package org.fkjava.test;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		// 定义了一个List集合，该集合只能存储User类型的数据。
		List<User> list = new ArrayList<User>();
		// 存储String的数据
		User u1 = new User(1,"jack","男",20);
		list.add(u1);
		list.add(new User(2,"rose","女",18));
		// 返回的一定是User数据，不在需要强制类型转换
		User s = list.get(0);

		// forEach循环的时候可以直接声明String类型
		for(User t : list){
			System.out.println(t);
		}

	}

}
