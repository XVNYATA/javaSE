package org.fkjava.lambda;

//吃的接口
interface Eatable
{
	// 方法是没有参数的
	void taste();
}

public class TestEat {
	
	// 调用该方法需要Eatable对象
	public void eat(Eatable e)
	{
		System.out.println(e);
		e.taste();
	}
	
	public static void main(String[] args) {
		TestEat t = new TestEat();
		/**
		 * 语法：
		 *  (形参列表) -> {
		        //方法体
		    };
		 * */
		// 1.正常写法
		t.eat(()->{
			System.out.println("苹果的味道不错！");
		});
		// 2.Lambda表达式的代码块只有一条语句，可以省略花括号。
		t.eat(()-> System.out.println("苹果的味道不错！"));
		
	}

}
