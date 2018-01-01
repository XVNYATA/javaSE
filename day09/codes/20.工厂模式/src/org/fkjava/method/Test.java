package org.fkjava.method;

import org.fkjava.bean.Fruit;
import org.fkjava.bean.Orange;

public class Test {

	/**
	 * 当使用(factoryMethod)工厂方法设计模式时，对象调用者需要与具体的工厂类耦合：
当需要不同对象时，程序需要调用相应工厂对象的方法来得到所需的对象
对于采用工厂方法的设计架构，客户端代码成功与被调用对象的实现类分离， 解耦合
但带来了另一种耦合：客户端代码与不同的工厂类耦合
这种方式使用比较少
	 * */
	public static void main(String[] args) {
		Fruit a = new AppleFactory().getFruit();
		System.out.println(a.getName());
		Fruit b = new BananaFactory().getFruit();
		System.out.println(b.getName());
		Fruit o = new OrangeFactory().getFruit();
		System.out.println(o.getName());

	}

}
