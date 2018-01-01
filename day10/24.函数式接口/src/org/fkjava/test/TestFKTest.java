package org.fkjava.test;

public class TestFKTest {
	
	public void test(FKTest t){
		t.test();
	}

	public static void main(String[] args) {
		
		TestFKTest t = new TestFKTest();
		t.test(()->{
			System.out.println("测试函数式接口");
		});
		// 如果只有一句代码，可以省略大括号
		t.test(()-> System.out.println("测试函数式接口"));
	}

}
