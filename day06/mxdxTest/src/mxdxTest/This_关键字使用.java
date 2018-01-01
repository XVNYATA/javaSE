package mxdxTest;

public class This_关键字使用 {
	
	private String name ;
	
	public void getName(){
		// this = th
		System.out.println(this.name); // 代表当前调用此方法的实例也就是调用这个方法的主调
		// 在一个方法中调用另一方法,实际上默认加上了当前实例(this)
		//this.getA();
		getA();
	}
	
	public void getA(){
		System.out.println("getA()");
	}
	
	private static String staticName = "疯狂软件";
	
	public static void name(){
		System.out.println();
	}
	
	public static void main(String[] args) {
		This_关键字使用 th = new This_关键字使用();
		th.name = "张三";
		th.getName();
	}
	
}
