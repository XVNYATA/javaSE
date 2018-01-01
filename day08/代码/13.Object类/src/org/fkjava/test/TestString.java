package org.fkjava.test;

public class TestString {

	public static void main(String[] args) {
		// String类里面就重写了equals方法。
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1 == s2); // false new出来的两个对象
		/**
		 * String的父类也是Object
		 * 当我们执行s1.equals(s2)，如果String类没有覆盖equals方法，那么返回结果一定是false
		 * 现在s1.equals(s2)返回结果是true，说明String类已经覆盖了equals方法
		 * */
		System.out.println(s1.equals(s2)); 

	}

}
