package org.fkjava.bean;


// 单例模式
public class Singleton {
	
	// 2.一个静态的成员变量，用来保存当前类唯一的实例
	private static Singleton instance;

	// 1. 私有构造器
	private Singleton(){
		
	}
	
	// 3.使用一个公共的静态方法，返回静态变量
	public static Singleton getInstance(){
		if(instance == null ){
			instance = new Singleton();
		}
		return instance;
	}
	
}
