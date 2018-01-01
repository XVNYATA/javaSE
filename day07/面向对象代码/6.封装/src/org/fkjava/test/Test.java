package org.fkjava.test;

import org.fkjava.bean.Person;

public class Test {

	public static void main(String[] args) {
//		Person p = new Person("jack","男",20);
//		String name = p.getName();
//		System.out.println(name);
		
		Person p = new Person();
		p.setName("jack");
		String name = p.getName();
		System.out.println(name);
	}

}
