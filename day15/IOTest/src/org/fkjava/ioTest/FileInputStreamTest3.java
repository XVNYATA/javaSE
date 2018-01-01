package org.fkjava.ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年4月30日下午3:44:07
 * @From www.fkjava.org
 *  缓冲区 ：性能好，不占用内存 ,如果输出内容没法避免乱码 
 */
public class FileInputStreamTest3 {
	public static void main(String[] args) {
		try {
			/** 先定位文件对象  */
			File file = new File("src/org/fkjava/ioTest/fkjava.txt");
			/** 将文件读成输入流 ：
			 *  得到一根输入管道
			 * */
			InputStream is = new FileInputStream(file);
			
			/** 只是一个缓冲区*/
			byte[] buffer = new byte[2048];
			
			int len = 0 ;
			/**
			 *  [o,o,o] =  is
			 *   aaaa你aa你aa你aa你aa你aa你
			 *   
			 * */
			while((len = is.read(buffer)) > 0){
				String rs = new String(buffer,0,len,"UTF-8");
				System.out.println(rs);
			};
			
			is.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
