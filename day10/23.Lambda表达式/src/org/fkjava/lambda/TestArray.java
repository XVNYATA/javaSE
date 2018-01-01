package org.fkjava.lambda;

import org.fkjava.util.FKArrays;
import org.fkjava.util.FKUtil;

public class TestArray {

	public static void main(String[] args) {
		// 1. 准备数组
		int[] arrays = new int[]{1,2,3,4,5};
		// 2. 创建FKUtil对象处理数组
		FKUtil u = new FKUtil();
		// 3. 使用Lambda调用处理数组的方法  
		/**
		 * 语法：
		 *  (形参列表) -> {
		        //方法体
		    };
		 * */
		u.processArray(arrays, (int[] target)-> {
				// 遍历
				for(int a : target){
					System.out.print(a + "\t");
				}
		});

	}

}
