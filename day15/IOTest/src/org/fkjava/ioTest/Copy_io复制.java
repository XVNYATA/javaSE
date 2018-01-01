package org.fkjava.ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年4月30日下午3:59:44
 * @From www.fkjava.org
 * 
 */
public class Copy_io复制 {
	public static void main(String[] args) {
		try {
			/** 1.定义一个文件对象：源文件 */
			File srcfile = new File("src/org/fkjava/ioTest/Copy_io复制.java");
			/** 2.将需要复制的文件定义一个输入流管道  */
			FileInputStream fis = new FileInputStream(srcfile);
			
			/** 3.定义一个输出的路径 */
			File destfile = new File("D:/fkjava/xulei.java");
			FileOutputStream fos = new FileOutputStream(destfile);
			
			/** 定义一个缓冲桶   */
			byte[] buffer = new byte[512];
			int len  = 0 ; // 用于保存每次多了多少个字节 
			while((len = fis.read(buffer)) > 0){
				/** 缓冲桶中有多少写多少 ：写到输出管道中去 */
				fos.write(buffer, 0, len);
			}
			
			/** 释放资源 */
			fis.close();
			fos.close();
			
			System.out.println("复制成功！");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
