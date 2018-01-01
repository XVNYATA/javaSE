package org.fkjava.other;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年5月2日下午3:47:41
 * @From www.fkjava.org
 * 
 */
public class DataInputStream特殊数据输入流 {
	public static void main(String[] args) throws Exception {
		File file = new File("src/org/fkjava/other/data.dat");
		
		InputStream is  = new FileInputStream(file);
		
		/** 将字节输入流转换成特殊数据字节输入流  */
		DataInputStream dis  = new DataInputStream(is);
		
		// 读取数据的顺序必须与写的一致 
		int score = dis.readInt();
		boolean flag = dis.readBoolean();
		double price = dis.readDouble();
		String nr = dis.readUTF();
		char ch = dis.readChar();
		
		System.out.println(score+"-----"+price+"---"+nr+"----"+ch);
		
		
	}
}
