package org.fkjava.bean;

// javabean  
// jdbc : dto
// hibernate : pojo
// spring : domain
public class Person {
	
	// 数据库信息
	private static String username;  // 用户名
	private static String password;  // 密码
	private String name ;
	
	// 静态代码块
	static{
		System.out.println("static 代码块");
		username = "admin";
		password = "123456";
	}
	
	// 动态(实例)代码块， 使用比较少
	{
		System.out.println("动态(实例) 代码块");
		this.name = "";
	}

	public Person(){
		System.out.println("构造器");
	}
	
	public void play(){
		 String a = "a";
		 // 很少用
	      {
	    	  String b = "b";
	    	  System.out.println(a);
	    	  System.out.println(b);
	      }
	}
	
	// 静态方法
	public static void test(){
		System.out.println(username + " " + password);
	}
}
