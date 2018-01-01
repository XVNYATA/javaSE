package org.fkjava.test;

public class Test {
	
	public static void main(String[] args) {
		// 创建一个整形的封装类
		Integer i = new Integer(100);
		// 把整形的封装类转成int值
		int a = i.intValue();
		// 在1.5之后会自动转换
//		int b = (int)i;
		int b = i;
		System.out.println(a);
	}

}
