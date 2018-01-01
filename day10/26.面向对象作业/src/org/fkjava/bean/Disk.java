package org.fkjava.bean;

public enum Disk implements SATA {
	
	SSD,HD;

	@Override
	public void read() {
		System.out.println(this.name() + "开始读数据");
		
	}

	@Override
	public void write() {
		System.out.println(this.name() + "开始写数据");
		
	}
	
}
