package org.fkjava.lambda;

//飞的接口
interface Flyable
{
	// 方法的参数的一个字符串
	void fly(String weather);
}

public class TestFly {
	
	// 调用该方法需要Flyable对象
	public void drive(Flyable f)
	{
		System.out.println("我正在驾驶：" + f);
		f.fly("【碧空如洗的晴日】");
	}

	public static void main(String[] args) {
		TestFly t = new TestFly();
		/**
		 * 语法：
		 *  (形参列表) -> {
		        //方法体
		    };
		 * */
		// 1. 正常写法
		t.drive((String weather) -> {
			System.out.println("今天天气是：" + weather);
			System.out.println("直升机飞行平稳");
		});
		// 2.Lambda表达式的形参列表只有一个形参，省略圆括号
		// weather是形参名
		t.drive(weather -> {
			System.out.println("今天天气是：" + weather);
			System.out.println("直升机飞行平稳");
		});

	}

}
