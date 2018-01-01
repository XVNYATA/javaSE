package org.fkjava.ioTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年4月30日下午2:25:52
 * @From www.fkjava.org
 *  文件输入流  :
 *   桶的大小不确定：可能过大也可能过小
 */
public class FileInputStreamTest {
	public static void main(String[] args) {
		try {
			/** 定义一个输入读入到内存中的文件对象 */
//			File file = new File("src/org/fkjava/ioTest/FileInputStreamTest.java");
			File file = new File("D:\\fkjava\\user.txt");
			/** 1.获取一个文件字节输入流  */
			InputStream fis = new FileInputStream(file);
			
			/** 从输入管道中读取一个“水滴”就是一个字节 */
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			
			/** 定义一个“桶”接收文件输入流的“水滴”  abc中国*/
			// a b c 中
			byte[] buffer = new byte[7];
			/** 把输入流中的“水滴”全部流到桶buffer中*/
			fis.read(buffer);
			// [O,O,O,O,O,0,0........]   abc中国   GBK
			//  a b c  
			String rs = new String(buffer,"GBK");
			System.out.println(rs);
			
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
