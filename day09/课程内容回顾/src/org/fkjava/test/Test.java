package org.fkjava.test;

import org.fkjava.bean.Person;

import org.fkjava.bean.Person;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person("jack","男",20);
		Person p2 = new Person("jack","男",20);
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println("==========");
		System.out.println(p1.getName().hashCode() == p2.getName().hashCode());
		System.out.println(p1.getSex().hashCode() == p2.getSex().hashCode());
		System.out.println(p1.getAge().hashCode() == p2.getAge().hashCode());
		

	}

}
