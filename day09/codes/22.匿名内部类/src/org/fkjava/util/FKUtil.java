package org.fkjava.util;

// 疯狂Java的工具类
public class FKUtil {
	
	/**
		处理数组的方法
		@param int[] arrays 要处理的数组 
		@param FKArrays fkArrays 接口
	*/
	public void processArray(int[] arrays,FKArrays fkArrays){
		// 调用接口处理数组的方法处理数组
		fkArrays.process(arrays);
	}

}
