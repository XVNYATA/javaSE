package org.fkjava.test;

import org.fkjava.bean.Animal;
import org.fkjava.bean.Cat;

public class Test {

	public static void main(String[] args) {
		// 抽象不能创建实例，不能new
//		Animal a = new Animal();
		
		// 多态
		// 抽象类虽然不能创建实例，但是抽象类的引用可以指向子类实例
		Animal a = new Cat();

	}

}
