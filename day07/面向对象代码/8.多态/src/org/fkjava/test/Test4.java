package org.fkjava.test;

import org.fkjava.bean.Man;
import org.fkjava.bean.Person;

public class Test4 {

	public static void main(String[] args) {
		// 父类引用指向子类实例
		Person p = new Man();
		// 强制类型转换
		Man m = (Man)p;
		m.play();

	}

}
