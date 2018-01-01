package org.fkjava.test;

import static java.util.Arrays.sort;

import java.util.Arrays;

public class TestStatic {

	/**
	 * 测试静态导入
	 * 从Java 5之后，提供了静态导入。用于把其他的类的静态成员导入到当前类来使用。
	 * 注意：如果本类有同名方法，会报错
	 * */
	public static void main(String[] args) {
		int[] array = new int[]{2,5,8,3,9};
		// 排序  
		// 静态导入后不需要Arrays.sort(array);，可以直接使用sort方法
		sort(array);
		// 报错，因为我们父类Object当中有toString方法
		//System.out.println(toString(array));
		System.out.println(Arrays.toString(array));

	}

}
