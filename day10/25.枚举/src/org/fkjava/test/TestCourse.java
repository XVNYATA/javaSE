package org.fkjava.test;

import org.fkjava.bean.Course;

public class TestCourse {

	public static void main(String[] args) {
		// 创建枚举
		Course c = Course.JAVASE;
		System.out.println(c.name());
		System.out.println(c.ordinal());
		c.info();

	}

}
