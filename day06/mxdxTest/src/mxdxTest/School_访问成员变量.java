package mxdxTest;

public class School_访问成员变量 {
	/** 定义一个成员变量
	 *  静态成员变量 ：有static修饰属于类的
	 *  */
	private static String schoolName = "疯狂软件" ;
	
	/**
	 * 没有static修饰
	 * 实例成员变量 ： 属于实例的
	 * */
	private int clazzNum;
	
	/**
	 * 没有static修饰
	 * 实例成员变量 ： 属于实例的
	 * */
	private String address;
	
	
	/** 定义一个无参数构造器  */
	public School_访问成员变量(){
		
	}
	
	/** 程序的主入口方法 ，默认就会执行此方法 */
	public static void main(String[] args) {
		/** 有static修饰的属于类的，可以直接用类调用*/
		System.out.println(School_访问成员变量.schoolName);
		// 不可以 ：没有static修饰的成员变量，属于实例的，必须用对象来调用。
		//System.out.println(School_访问成员变量.address);
//		  System.out.println(School_访问成员变量.clazzNum);
		
		
		/** 创建对象(实例)：调用无参数构造器创建一个对象 sh 
		 *  Random rd = new Random();
		 *   */
		School_访问成员变量 sh = new School_访问成员变量();
		sh.address = "广州";
		/** 访问实例的成员变量:必须用对象调用*/
		System.out.println(sh.address);
		
		School_访问成员变量 sh1 = new School_访问成员变量();
		sh1.address = "武汉";
		System.out.println(sh1.address);
		
		System.out.println(School_访问成员变量.schoolName);
		
		
		
	}

}
