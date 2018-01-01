package org.fkjava.bean;

// 经理是一个抽象类，很多工作可以确定，有些工作不能确定
public abstract class Manager {
	
	//  整形数组
	private int[] arrays;
	
	public void test(){
		System.out.println("调用父类的非抽象方法test");
		// 确定工作
		arrays = new int[]{1,2,3,4,5};
		// 处理数组
		this.proccessArray(arrays);
	}

	// 处理数组的工作不能确定，交个子类实现
	public abstract void proccessArray(int[] arrays);
	
}
