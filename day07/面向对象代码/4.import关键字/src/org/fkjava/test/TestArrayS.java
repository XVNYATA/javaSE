package org.fkjava.test;

import java.util.Arrays;

public class TestArrayS {

	/**
	 * 测试使用java.util.ArrayS类
	 * */
	public static void main(String[] args) {
		
		int[] array = new int[]{2,5,8,3,9};
		
		// 排序
		Arrays.sort(array);
		
		// 输出
		System.out.println(Arrays.toString(array));
		

	}

}
