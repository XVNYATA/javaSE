package org.fkjava.test;

//简单了解
interface Displayable{
	// 定义一个抽象方法和默认方法
	void display();
	// java8之后的新功能
	default int add(int a,int b){
		return a + b;
	}
	
}

public class LambdaAndinner {
	
	private int age = 12;
	private static String name = "疯狂软件教育中心";
	public void test(){
		String book = "疯狂Java讲义";
		Displayable dis = ()->{
			// 访问final变量
			System.out.println("book局部变量为：" + book);
			// 访问外部类的实例变量和类变量
			System.out.println("外部类的age实例变量为："+age);
			System.out.println("外部类的name类变量为："+name);
		};
		dis.display();
		// 使用Lambda表达式创建的对象可以调用接口中的默认的方法
		System.out.println(dis.add(3, 5));
		
	}
	
	
	public static void main(String[] args) {
		LambdaAndinner lambda = new LambdaAndinner();
		lambda.test();
		
	}

}
