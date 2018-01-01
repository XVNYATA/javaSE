package org.fkjava.ioTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年4月30日下午3:47:33
 * @From www.fkjava.org
 *  输出流 
 */
public class FileOutputStreamTest {
	public static void main(String[] args) {
	    try {
	    	/** 1.定义一个输出的文件对象  :内存数据输出到哪里去  */
			File file = new File("D:/xlei.txt");
			/** 2.定义一个输出流管道  */
			OutputStream ous = new FileOutputStream(file);
			
			ous.write(97);
			ous.write(98);
			ous.write(98);
			
			byte[] buffer = "我喜欢疯狂软件".getBytes("GBK");
			ous.write(buffer);
			
			/** 关闭资源*/
			ous.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
