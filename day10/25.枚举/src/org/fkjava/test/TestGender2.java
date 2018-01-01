package org.fkjava.test;

import org.fkjava.bean.Gender2;

public class TestGender2 {

	public static void main(String[] args) {
		// 创建枚举
		Gender2 gender = Gender2.MALE;
		// 打印枚举
		System.out.println(gender);
		// 打印枚举的getName的返回值
		System.out.println(gender.getName());

	}

}
