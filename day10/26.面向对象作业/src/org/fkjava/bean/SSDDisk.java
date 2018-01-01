package org.fkjava.bean;

public class SSDDisk implements SATA {

	@Override
	public void read() {
		System.out.println("SSDDisk开始读数据");
		
	}

	@Override
	public void write() {
		System.out.println("SSDDisk开始写数据");
		
	}

}
