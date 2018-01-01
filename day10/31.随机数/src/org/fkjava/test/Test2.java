package org.fkjava.test;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {
		// 获得一个随机数对象
		Random random = new Random();
		// 返回的是0-1直接的一个double值
		double d = random.nextDouble();
		System.out.println(d);
		// 获得0-100的随机数
		int i = random.nextInt(101);
		System.out.println(i);
		// 获得50 - 100的随机数
		int i2 = (int)(random.nextDouble()*50+50);
		System.out.println(i2);
		
		
		
		
		
	/*	// 返回int范围的值
		int i = random.nextInt();
		System.out.println(i);*/

	}

}
