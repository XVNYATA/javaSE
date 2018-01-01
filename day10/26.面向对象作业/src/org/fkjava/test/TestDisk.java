package org.fkjava.test;

import org.fkjava.bean.Disk;

public class TestDisk {

	public static void main(String[] args) {
		// 创建枚举对象
		Disk disk = Disk.SSD;
		disk.read();
		Disk hd = Disk.HD;
		hd.read();

	}

}
