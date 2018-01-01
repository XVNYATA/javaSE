package org.fkjava.util;

public class Test2 {

	public static void main(String[] args) {
		// 1. 准备数组
		int[] arrays = new int[]{1,2,3,4,5};
		// 2. 创建FKUtil对象处理数组
		FKUtil u = new FKUtil();
		// 3. 调用处理数组的方法
		// 4. 创建接口的实例
		J1604Arrays j = new J1604Arrays();
		u.processArray(arrays, j);
		

	}

}
