package org.fkjava.bean;

import org.fkjava.interfaces.Play;
import org.fkjava.interfaces.Study;

// Student类可以实现接口
public class Student extends Person implements Study,Play{

	@Override
	public void read() {
		System.out.println("Student实现Study接口read方法");
		
	}

	@Override
	public void write() {
		System.out.println("Student实现Study接口write方法");
		
	}

	@Override
	public void run() {
		System.out.println("Student实现Play接口的run方法");
		
	}

}
