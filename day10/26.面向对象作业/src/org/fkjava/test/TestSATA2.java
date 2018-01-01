package org.fkjava.test;

import org.fkjava.bean.SATA;

public class TestSATA2 {

	public static void main(String[] args) {
		// 使用匿名内部类的方式，再实现一个SATA接口
		SATA sata = new SATA() {
			
			@Override
			public void write() {
				System.out.println("SATA开始写数据");
				
			}
			
			@Override
			public void read() {
				System.out.println("SATA开始读数据");
				
			}
		};
		
		sata.read();

	}

}
