package org.fkjava.ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年4月30日下午3:09:48
 * @From www.fkjava.org
 *  字节输入流的使用 
 *   桶的大小不确定：内存一次性加载文件数据流：浪费内存性能差
 */
public class FileInputStreamTest2 {
	public static void main(String[] args) {
		try {
			/** 先定位文件对象  */
			File file = new File("src/org/fkjava/ioTest/fkjava.txt");
			/** 将文件读成输入流 ：
			 *  得到一根输入管道
			 * */
			InputStream is = new FileInputStream(file);
			
			/** 定义一个桶 :
			 * is.available()获取输入流中字节个数
			 * 这个参数可以控制桶的大小：文件字节流有多少，桶就有多大
			 *  */
//			System.out.println(is.available());
		
			byte[] buffer = new byte[is.available()];
			
			/** 将流装入到桶中 */
			is.read(buffer);
			
			String result = new String(buffer,"UTF-8");
			
			System.out.println(result);
			
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
