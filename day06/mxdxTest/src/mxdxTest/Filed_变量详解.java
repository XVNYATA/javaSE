package mxdxTest;

public class Filed_变量详解 {
	/** static修饰成员变量 */
	private static String name ="变量详解";
	private static int a = 100;
	/** 代码块  ：静态代码块*/
	static{
		/** 代码块中的布局变量 */
		String name = "static代码块";
		System.out.println("name:"+name);
	}
	
	public static void a(){
		
	}
	
	/** 实例成员变量  */
	private String stuName;
	
	
	/** 形参局部变量  */
	public void test(String name){
		
	}
	
	public static void main(String[] args) {
		
		Filed_变量详解 ff = new Filed_变量详解();
		
		Filed_变量详解 ff1 = new Filed_变量详解();
		ff1.stuName = "张三";
		System.out.println(ff1.stuName);
		
		Filed_变量详解 ff3 = new Filed_变量详解();
		System.out.println(ff3.stuName);
		
	}
	
}
