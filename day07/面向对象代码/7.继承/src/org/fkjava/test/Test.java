package org.fkjava.test;

import org.fkjava.bean.Cat;
import org.fkjava.bean.Pig;

public class Test {

	public static void main(String[] args) {
		Pig p = new Pig();
		p.setName("猪");
		p.setAge(2);
		p.setSex("母");
		p.setWeight(50);
		// 注意：创建子类对象的时候，必然会先创建父类对象
		/*
		 * Animal 构造器    1. 执行父类构造器
			Pig 构造器        2. 执行子类构造器
			猪 母 2 50.0  3. 打印
		 * */
		System.out.println(p.getName() + " " + p.getSex() + " " + p.getAge() + " " + p.getWeight());
		// 因为子类没有eat方法，会调用父类的eat方法
		p.eat();
		// 子类和父类都有shout方法，会调用子类的shout方法
		p.shout();
		
		
		Cat cat = new Cat();
		cat.play();
	}

}
