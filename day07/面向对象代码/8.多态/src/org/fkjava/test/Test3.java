package org.fkjava.test;

import org.fkjava.bean.Man;
import org.fkjava.bean.Person;

public class Test3 {

	/**
	 * 父类和子类的转换
	 * */
	public static void main(String[] args) {
		// java.lang.ClassCastException: org.fkjava.bean.Person cannot be cast to org.fkjava.bean.Man
		// 强制类型转换，语法正确，但是new出来的是Person，所以执行时抛出异常
		Man m = (Man)new Person();
		m.play();

	}

}
