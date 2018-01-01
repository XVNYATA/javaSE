package org.fkjava.charStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年5月2日上午11:16:38
 * @From www.fkjava.org
 * 
 */
public class BufferedInputStreamTest {
	public static void main(String[] args) {
		BufferedInputStream bis =null;
		BufferedOutputStream bos = null;
		try {
			File srcFile = new File("D:/fkjava/user.txt");
			/** 将输入流转换成缓冲输入流:
			 * 可以往缓冲池中倒水   */
			bis =new BufferedInputStream(new FileInputStream(srcFile));
			
			File descFile = new File("D:/userXlei.txt");
			/** 将输出流转换成缓冲输出流 */
			bos = new BufferedOutputStream(new FileOutputStream(descFile));
			
			byte[] buffer = new byte[512];
			int len  = 0 ;
			while((len = bis.read(buffer)) > 0){
				bos.write(buffer, 0, len);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(bis!=null)bis.close();
				if(bos!=null)bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
