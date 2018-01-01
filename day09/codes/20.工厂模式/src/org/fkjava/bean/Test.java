package org.fkjava.bean;

public class Test {

	// 没有使用工厂模式
	// 每次要new出不同的对象
	public static void main(String[] args) {
		Fruit a = new Apple();
		System.out.println(a.getName());
		Fruit b = new Banana();
		System.out.println(b.getName());
		Fruit o = new Orange();
		System.out.println(o.getName());
	}

}
