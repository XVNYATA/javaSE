package org.fkjava.test;

import org.fkjava.bean.Driver;

import org.fkjava.bean.Car;

public class Test {

	public static void main(String[] args) {
		// 创建汽车对象
		Car car = new Car();
		// 赋值
		car.setBrand("比亚迪");
		// 创建司机对象
		Driver driver = new Driver();
		// 赋值
		driver.setName("屌丝");
		// 将car对象赋给Driver的car属性，这样两个对象就关联起来
		driver.setCar(car);
		// 调用方法
		driver.go();
		
	}

}
