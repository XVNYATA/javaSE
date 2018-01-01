package org.fkjava.bean;

// 猪继承动物  子类
public class Pig extends Animal {
	
	// 重量
	private double weight;

	public Pig() {
		System.out.println("Pig 构造器");
		// protected修饰的字段， 子类里面可以访问
		this.color = "";
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// 覆盖父类方法
	// @Override 标注表示当前方法是覆盖父类方法，如果违法覆盖的原则，则编译不通过
	@Override
	public void shout(){
		System.out.println("熬熬......");
	}
	
}
