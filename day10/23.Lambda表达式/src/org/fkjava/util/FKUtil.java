package org.fkjava.util;

// 工具类，可以处理数组，处理字符串，获取数据库连接......
public class FKUtil {
	
	/**
	 * 处理数组的方法
	 * @param arrays 需要处理的数组
	 * @param fkArrays  处理数组的接口的实例,既然是实例，一定已经实现了process方法
	 * */
	public void processArray(int[] arrays,FKArrays fkArrays){
		fkArrays.process(arrays);
	}
	
	

}
