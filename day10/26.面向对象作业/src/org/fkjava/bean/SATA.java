package org.fkjava.bean;

/**
 * 2.定义一个接口和两个实现类：比如SATA接口的两个可读的设备实现：
 * SSDDisk和HardDisk都实现SATA接口，
 * 该接口定义了读、写的方法。写一个测试类使用SATA接口类型的对象。
 * */
public interface SATA {
	
	// 读方法
	void read();
	// 写方法
	void write();

}
