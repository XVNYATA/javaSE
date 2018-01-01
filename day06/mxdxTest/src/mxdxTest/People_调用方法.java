package mxdxTest;

import java.util.Arrays;

public class People_调用方法 {
	
	/** 有static修饰的静态方法  */
	public static void sing(String name){
		System.out.println(name+",正在唱歌");
	}

	/**  没有static修饰的实例方法*/
	public String work(String name){
		System.out.println(name+",正在工作！");
		return name+"-很认真";
	}
	
	void jump(){
		System.out.println("人都可以跳起来");
	}
	
	public String paraseArray(String[] arrs,String name){
		System.out.println("地址:"+arrs);
		System.out.println("内容:"+Arrays.toString(arrs));
		/** 解析数组：打出每一个元素  */
		for(String arr : arrs){
			System.out.println("---:"+arr);
		}
		return name+":解析成功";
	}
	
	public static void main(String[] args) {
		/** 这个方法属于静态方法 ，所以直接用类作为主调调用 */
		//People_调用方法.sing("罗文强");
		/** 在同一个类中调用静态方法，可以省略类作为主调，会自动加上类名调用方法 .这样方便！ */
		//sing("罗文强");
		
		/** 不对，实例方法不能用类直接调用，必须创建对象来调用 */
		//People_调用方法.work("李刚");
		People_调用方法  p = new People_调用方法();
		/** 如果方法有返回值 可以定义对应类型变量进行接收*/
//		String result = p.work("李刚");
//		System.out.println("---"+result);
		/** 等价于以上写法，直接调用方法，输出方法的返回结果*/
		//System.out.println(p.work("李刚"));
		
		//p.jump();
		
		String[] ars = new String[]{
				"春花秋月何时了",
				"往事知多少",
				"小楼昨夜又东风",
				"故国不堪回首月明中"
		};
		
		System.out.println(p.paraseArray(ars,"李煜"));
	
	}
	
	
}
