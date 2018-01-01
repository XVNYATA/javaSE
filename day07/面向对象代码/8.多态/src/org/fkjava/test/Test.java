package org.fkjava.test;

import org.fkjava.bean.Animal;
import org.fkjava.bean.Cat;

public class Test {

	public static void main(String[] args) {
		// 编译时多态
		// 动物 a = new 猫
		// 猫属于动物，子类对象付给父类引用，会自动进行类型转换
		Animal a = new Cat();
		// 运行时多态，虽然是动物的引用变量，实际是猫的实例，所以调用的是猫的shout方法
		a.shout();

	}

}
