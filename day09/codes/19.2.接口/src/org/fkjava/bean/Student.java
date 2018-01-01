package org.fkjava.bean;

import org.fkjava.interfaces.Play;
import org.fkjava.interfaces.Study;

public class Student implements Study,Play{
	
	@Override
	public void say(){
		System.out.println("重写的say方法");
	}
	

}
