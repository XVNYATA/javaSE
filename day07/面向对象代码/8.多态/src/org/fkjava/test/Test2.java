package org.fkjava.test;

import org.fkjava.bean.Man;
import org.fkjava.bean.Person;
import org.fkjava.bean.WoMan;

public class Test2 {
	
	public static void test(Person p ){
		
	}

	public static void main(String[] args) {
		// 编译时多态
		// 人 p = new 男人
		// 子类对象付给父类引用，会自动进行类型转换
		Person p = new Man();
		// 运行时多态,方法是动态绑定，所以调用的是Man的play方法
		p.play();
		// 变量是静态绑定，所以打出的是Peson对象的aa
		System.out.println(p.aa);
		
		// 子类实例可以传递给需要父类参数的方法
		WoMan wm = new WoMan();
		Test2.test(wm);
		
	}

}
