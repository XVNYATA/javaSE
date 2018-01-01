package org.fkjava.other;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年5月2日下午2:36:59
 * @From www.fkjava.org
 * 
 */
public class DataOutputStream特殊数据输出流 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/org/fkjava/other/data.dat");
		
		OutputStream os = new FileOutputStream(file);
		
		/** 把输出流包装成特殊数据字节输出流  */
		DataOutputStream dos = new DataOutputStream(os);
		
		// 扫雷游戏
		dos.writeInt(87);  // 87
		dos.writeBoolean(true); // 
		dos.writeDouble(10.8);  // 
		dos.writeUTF("疯狂扫雷");
		dos.writeChar('A');
		
		dos.close();
		
	}
}





