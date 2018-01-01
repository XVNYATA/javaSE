package org.fkjava.bean;

// B称为A的实现类，又称为A的子类
public class B implements A{

	@Override
	public void play() {
		System.out.println("实现A的抽象方法");
		
	}

}
