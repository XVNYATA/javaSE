package mxdxTest;

public class Filed_变量详解1 {
	
	/** 成员变量可以不指定初始值   
	 *  成员变量初始值是默认值：  
	 *    数值类型都是 0  
	 *    boolean 是false
	 *    引用类型都是null
	 *    
	 *  */
	private static String str;
	
	private String name ;
	
	
	
//	private String str;
	
	public static void main(String[] args) {
		System.out.println(str);
		
		Filed_变量详解1 f = new Filed_变量详解1();
		System.out.println(f.name);
		
	   
		int a = 1;
		System.out.println(a);
		
	}
	
}
