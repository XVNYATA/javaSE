package org.fkjava.bean;

// Student继承Peson类，必须实现Peson的抽象方法
public class Student extends Person{

	@Override
	public void sayHello() {
		System.out.println("你好，我是" + this.getName());
		
	}
	
	

}
