package org.fkjava.bean;

public class HardDisk implements SATA {

	@Override
	public void read() {
		System.out.println("HardDisk开始读数据");

	}

	@Override
	public void write() {
		System.out.println("HardDisk开始写数据");

	}

}
