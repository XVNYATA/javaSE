package org.fkjava.test;

import java.util.Objects;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("jack", "男", 20);
		Person p2 = new Person("jack", "男", 20);
		Person p3 = null;
		
		System.out.println(Objects.equals(p1, p2));
		System.out.println(Objects.hashCode(p1));
		System.out.println(Objects.isNull(p1));
		System.out.println(Objects.isNull(p3));
		System.out.println(Objects.nonNull(p1));
		System.out.println(Objects.toString(p1));
		
		/*// 抛出空指针
		if(p3.equals(p1)){
			System.out.println("相等");
		}*/
		
		if(p3 != null && p3.equals(p1)){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}
		
		if(Objects.equals(p3, p1)){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}
		
	}
}

/*
 * 模拟实现
 * class Objects{
	
	public boolean equals(Object a,Object b){
		return a.equals(b);
	}
}*/