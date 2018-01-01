package org.fkjava.test;

public class TestMethod {

	public static void main(String[] args) {
		// 测试字符串的常用方法
		String s1 = "helloworld";
		
		System.out.println(s1.length());
		System.out.println(s1.indexOf("l"));
		System.out.println(s1.charAt(0));
		System.out.println(s1.lastIndexOf("l"));
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5,8));
		System.out.println(s1.replace("l", "f"));
		System.out.println(s1.startsWith("h"));
		System.out.println(s1.endsWith("ld"));
		System.out.println(s1.toUpperCase());
		System.out.println("HELLO".toLowerCase());
		
		String s2 = " hello  world ";
		System.out.println(s2.length());
		System.out.println(s2.trim().length());

	}

}
