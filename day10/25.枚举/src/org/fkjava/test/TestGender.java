package org.fkjava.test;

import org.fkjava.bean.Gender;

public class TestGender {

	public static void main(String[] args) {
		// 通过Enum的valueOf()方法来获取指定枚举类的枚举值
//		Gender g = Enum.valueOf(Gender.class, "FEMALE");
		Gender g = Gender.FEMALE;
		// 直接为枚举值的name实例变量赋值
		g.setName("女");
		// 直接访问枚举值的name实例变量
		System.out.println(g + "代表:" + g.getName());

	}

}
