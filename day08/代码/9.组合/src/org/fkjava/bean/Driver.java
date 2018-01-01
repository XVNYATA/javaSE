package org.fkjava.bean;

// 司机
public class Driver {
	
	private String name;
	
	// 司机有一个成员变量的汽车 , 组合关系
	private Car car;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	// 司机出发
	public void go(){
		System.out.println("我是" + this.name);
		// 司机的汽车启动
		this.car.run();
	}

	
}
