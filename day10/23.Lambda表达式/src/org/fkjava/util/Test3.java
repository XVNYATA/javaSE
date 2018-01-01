package org.fkjava.util;

public class Test3 {

	public static void main(String[] args) {
		// 1. 准备数组
		int[] arrays = new int[]{1,2,3,4,5};
		// 2. 创建FKUtil对象处理数组
		FKUtil u = new FKUtil();
		// 3. 调用处理数组的方法
		// 匿名内部类new FKArrays接口获得的一定是FKArrays接口的实现类，区别是没有名字
		u.processArray(arrays, new FKArrays() {
			
			@Override
			public void process(int[] arrays) {
				// 遍历
				for(int a : arrays){
					System.out.print(a + "\t");
				}
				
			}
		});
		

	}

}
