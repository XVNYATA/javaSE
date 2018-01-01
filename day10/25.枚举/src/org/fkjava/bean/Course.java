package org.fkjava.bean;

public enum Course implements CourseDesc{
	
	JAVASE,JAVAEE,ANDROID,IOS;

	@Override
	public void info() {
		System.out.println("课程名称：" + this.name());
		
	}

}
