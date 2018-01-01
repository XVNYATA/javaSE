package org.fkjava.test;

public class Test {

	public static void main(String[] args) {
		 //全部使用字节表示，字节 / 1024等于KB，再除以1024等于MB，再除以1024等于GB
        // 1024 B = 1KB
        // 1024KB = 1MB
        // 1024MB = 1GB
        // 1024GB = 1TB
		Runtime rt = Runtime.getRuntime();
//        freeMemory() : 获取空闲的内存
		System.out.println(rt.freeMemory()/1024/1024);
//        maxMemory()  : Java虚拟机可以使用的最大内存
		System.out.println(rt.maxMemory());
//        totalMemory(): 已经分配给java虚拟机使用的总内存
		System.out.println(rt.totalMemory());
//        availableProcessors() : 返回所有可用CPU的数量，比如4的核CPU，返回4。
		System.out.println(rt.availableProcessors());
	}

}
