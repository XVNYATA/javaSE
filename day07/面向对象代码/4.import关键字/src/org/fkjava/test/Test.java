package org.fkjava.test;

import org.fkjava.inter.User;

public class Test {

	/**
	 * org.fkjava.oa.User
	 * org.fkjava.inter.User
	 * org.fkjava.weixin.User
	 * org.fkjava.test.Test
	 * 理解成：
	 * 有四个教室，oa、inter、weixin、test
	 * 
	 * */
	public static void main(String[] args) {
		
		// 1. 写清楚包名.类名访问
		org.fkjava.oa.User u1 = new org.fkjava.oa.User();
		System.out.println(u1.dept);
		// 2. 使用import关键字导包
		User u2 = new User();
		System.out.println(u2.dept);
		// 3. 访问weixin
		org.fkjava.weixin.User u3 = new org.fkjava.weixin.User();
		System.out.println(u3.dept);
		
		// !!!建议，如果在一个类中访问同名的类，最好是写包名.类名
	}

}
