package org.fkjava.interfaces;

// 定义接口 ： 学习
// 接口规定子类必须实现方法
public interface Study {
	
	// 接口里面的变量都是常量
//	public static final String CLAZZ = "j1604";
	String CLAZZ = "j1604";
	
	// 接口里面的方法都是public abstract
	public abstract void read();
	
	void write();
	
	/*了解
	 * 公共的、静态的方法，有方法体
	 * public static void sayHello(){
		
	}
	
	公共的、默认的方法，有方法体
	public default void eat(){
		
	}*/

}
