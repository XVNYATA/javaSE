package org.fkjava.statics;

// 外部类
public class Outer {
	
	// 外部类的静态变量
	private static Integer outer_i = 100;
	// 外部类的实例变量
	private Integer i = 200;
	
	// 外部类的实例方法
	public void say(){
		System.out.println("外部类的say方法");
	}
	
	// 外部类的静态方法
	public static void play(){
		System.out.println("外部类的静态play方法");
	}
	
	// 在类里面定义的类，用static修饰，就是静态内部类
	static class Inner{
		
		private Integer inner_i = 50;
		
		// 也可以有非静态的属性和方法;但是在静态方法中不能调用非静态的属性;
		public void test(){
			System.out.println(outer_i);
			System.out.println(inner_i);
//			System.out.println(i); 不能访问非静态变量
//			say(); 不能访问非静态方法
			play();
		}
		
		public static void hello(){
			System.out.println(outer_i);
//			System.out.println(inner_i); 静态方法不能访问非静态属性
			play();
		}
	}

}
