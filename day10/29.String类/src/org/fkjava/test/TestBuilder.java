package org.fkjava.test;

public class TestBuilder {

	public static void main(String[] args) {
		// 创建StringBuilder对象
		StringBuilder b = new StringBuilder();
		// 调用追加方法
		b.append("hello");
		b.append("world");
		System.out.println(b);
		// 把一个StringBuilder对象转成String
		String s = b.toString();
		
		// 从第3个位置插入一个字符串java
		b.insert(3, "java");
		System.out.println(b);
		
		// 翻转s1
		String s1 = "helloworld";
		// 将s1这个字符串转成StringBuilder对象
		StringBuilder b2 = new StringBuilder(s1);
		// 反转字符串
		b2.reverse();
		// 将反转后的字符串再次转成String类型
		s1 = b2.toString();
		System.out.println(s1);
		
		
		StringBuilder b3 = new StringBuilder("javaee");
		// 删除索引位置上的字符
		b3.deleteCharAt(2);
		System.out.println(b3);
		

	}

}
