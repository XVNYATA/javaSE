package org.fkjava.test;

import org.fkjava.bean.SATA;
import org.fkjava.bean.SSDDisk;

public class TestSATA {

	public static void main(String[] args) {
		// 面向接口编程
		SATA sata = new SSDDisk();
		// 调用方法，此时调用的是子类方法，多态
		sata.read();

	}

}
