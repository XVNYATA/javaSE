package org.fkjava.test;

public class Test1 {

	public static void main(String[] args) {
		// Math.random()返回的是0-1直接的一个double值
		System.out.println(Math.random());
		// （类型）最小值+Math.random()*最大值
		//   (int)(1+Math.random()*10)
		int i = (int)(1 + Math.random()*10);
		System.out.println(i);
	}

}
