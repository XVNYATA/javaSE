package org.fkjava.local;

// 外部类
public class Outer {

	// 外部类的静态变量
	private static Integer outer_i = 100;
	// 外部类的实例变量
	private Integer i = 200;

	// 外部类的实例方法
	public void say() {
		System.out.println("外部类的say方法");
	}

	// 外部类的静态方法
	public static void play() {
		System.out.println("外部类的静态play方法");
	
	}
	
	public void run(){
		
		// 写在方法里面的内部类，称为局部内部类
		class Inner{
			
			public void test(){
				System.out.println(outer_i);
				System.out.println(i);
				say();
				play();
			}
		}
		
		// 局部内部类只能在方法中创建实例
		Inner inner = new Inner();
		inner.test();
	
	}

}
