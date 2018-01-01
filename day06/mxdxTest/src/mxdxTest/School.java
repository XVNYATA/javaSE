package mxdxTest;

public class School {
	/** 定义一个成员变量
	 *  静态成员变量 ：属于类的
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
	public School(){
		
	}
	
	/** 程序的主入口方法 ，默认就会执行此方法 */
	public static void main(String[] args) {
		/** 有static修饰的属于类的，可以直接用类调用*/
		System.out.println(School.schoolName);
		// 不可以
		//System.out.println(School.address);
//		System.out.println(School.clazzNum);
		
		
		/** 创建对象(实例)：调用无参数构造器创建一个对象 sh 
		 * Random rd = new Random();
		 *   */
		School sh = new School();
		sh.address = "广州";
		/** 访问实例的成员变量*/
		System.out.println(sh.address);
		
		School sh1 = new School();
		sh1.address = "武汉";
		System.out.println(sh1.address);
		
		System.out.println(School.schoolName);
		
		
		
	}

}
