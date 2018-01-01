package org.fkjava.bean;

// 汽车类
public class Car {
	
	private String brand;

	public void setBrand(String brand){
		this.brand = brand;
	}
	
	public String getBrand(){
		return this.brand;
	}
	
	public void run(){
		System.out.println(this.brand + " 启动");
	}
}
