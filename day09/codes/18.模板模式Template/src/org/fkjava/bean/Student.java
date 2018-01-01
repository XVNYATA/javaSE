package org.fkjava.bean;

public class Student extends Manager {

	// 必须实现父类的抽象方法
	@Override
	public void proccessArray(int[] arrays) {
		System.out.println("调用子类的覆盖的抽象方法proccessArray");
		// 处理方式：遍历数组
		for(int a : arrays){
			System.out.print(a + "\t");
		}
	}

}
