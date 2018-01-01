package org.fkjava.abstracts;

import org.fkjava.bean.Fruit;

public class Test {

	/**
	 * 具体产生哪个水果则由Farmer抽象工厂决定，
不同的参数将产生不同的Fruit对象。通过采用抽象工厂的设计模式，
系统可以让客户端代码与被调用对象的实现类、具体的工厂类分离。
	 * */
	public static void main(String[] args) {
		Fruit f = FramerFactory.getFruit("Apple");
		System.out.println(f.getName());

	}

}
