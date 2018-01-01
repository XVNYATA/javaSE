package org.fkjava.lambda;

//添加的接口
interface Addable
{
	// 两个参数的方法，返回int值
	int add(int a , int b);
}

public class TestAdd {
	
	// 调用该方法需要Addable对象
	public void test(Addable add)
	{
		int result = add.add(5, 3);
		System.out.println("5与3的和为：" + result);
	}

	public static void main(String[] args) {
		TestAdd t = new TestAdd();
		/**
		 * 语法：
		 *  (形参列表) -> {
		        //方法体
		    };
		 * */
		// 1. 正常写法
		t.test((int a,int b) -> {
			return a + b;
		});
		// 2. Lambda表达式的代码块只有一条语句，省略花括号
		// 代码块中只有一条语句，即使该表达式需要返回值，也可以省略return关键字。
		t.test((int a,int b) -> a + b );
		
	}

}
