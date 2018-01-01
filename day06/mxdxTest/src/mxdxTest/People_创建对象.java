package mxdxTest;

import java.util.Arrays;

public class People_创建对象 {
	
	/** 对象 是通过构造器创建的
	 *  无参数构造器  
	 *   */
	public People_创建对象(){
		System.out.println("====无参数构造器====");
	}
	
	/** 有参数构造器 */
	public People_创建对象(String name){
		System.out.println("====一个参数构造器====name："+name);
	}
	
	/** 有参数构造器 */
	public People_创建对象(String[] names,int a){
		System.out.println("====二个参数构造器====names:"+Arrays.toString(names)+"-->a:"+a);
	}
	
	public static void main(String[] args) {
		/** 使用无参数的构造器创建一个对象  */
		People_创建对象 p = new People_创建对象();
		System.out.println("p"+p);
		
		//Random ran = new Random();
		
		/** 类型  变量 = 对象 
		 *  调用有参数的构造器创建一个对象
		 * */
		People_创建对象 p1 = new People_创建对象("张三");
		System.out.println("p1"+p1);
		
		/** 类型 变量  = 对象  */
		People_创建对象 p2 = new People_创建对象(new String[]{"a","b"},10);
		System.out.println(p2);
	}
}


