package org.fkjava.bean;

public class Employee extends Manager {

	// 必须实现父类的抽象方法
	@Override
	public void proccessArray(int[] arrays) {
		System.out.println("调用子类的覆盖的抽象方法proccessArray");
		// 处理方式：遍历数组，将结果累加
		int sum = 0;
		for(int a : arrays){
			sum += a;
		}
		System.out.println("数组累加结果：" + sum);
	}

}
