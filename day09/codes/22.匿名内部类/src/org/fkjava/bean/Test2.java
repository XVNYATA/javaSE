package org.fkjava.bean;

public class Test2 {

	public static void main(String[] args) {
		/*TestA t = new TestA();
		B类实现了A接口
		A a = new B();
		t.test(a);*/
		
		TestA t = new TestA();
		// 匿名内部类
		t.test(new A(){
			
			@Override	
			public void play(){
				System.out.println("实现A接口的play方法");
			}
			
		});
		

	}

}










