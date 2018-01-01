package org.fkjava.util;

public class Test {

	public static void main(String[] args) {
		// 准备数组
		int[] arrays = new int[]{1,2,3,4,5};
		// 创建工具类
		FKUtil util = new FKUtil();
		
		// 调用工具类处理数组的方法，使用匿名内部类
		
		// 第一种处理方式
		util.processArray(arrays, new FKArrays() {
			
			@Override
			public void process(int[] arrays) {
				// 遍历
				for(int i : arrays){
					System.out.print(i + "\t");
				}
				System.out.println();
			}
		});
		
		// 第二种处理方式
		util.processArray(arrays, new FKArrays() {
			
			@Override
			public void process(int[] arrays) {
				int sum = 0;
				for(int i : arrays){
					sum += i;
				}
				System.out.println("求和: " + sum);
			}
		});

	}

}
