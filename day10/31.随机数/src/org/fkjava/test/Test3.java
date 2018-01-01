package org.fkjava.test;

import java.util.concurrent.ThreadLocalRandom;

public class Test3 {
	// control + shift + F
	public static void main(String[] args) {
		// 通过静态方法获取实例
		ThreadLocalRandom tlr = ThreadLocalRandom.current();
		// 0 - 100
		int i = tlr.nextInt(101);
		System.out.println(i);
		// 50 - 100
		int i2 = tlr.nextInt(50, 101);
		System.out.println(i2);

	}

}
