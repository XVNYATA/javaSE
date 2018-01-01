package org.fkjava.bean;

public class Person {
	
	
	// 建议不要在父类构造器中调用被子类重写的方法。
	public Person() {
		super();
		System.out.println("Person()");
		this.sayHello();
	}

	public void sayHello(){
		
	}

}
