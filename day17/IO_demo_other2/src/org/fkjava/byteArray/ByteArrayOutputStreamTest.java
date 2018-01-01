package org.fkjava.byteArray;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Author xlei 
 * @Version 1.0
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Date 2016年5月3日上午9:18:44
 * @From http://www.fkjava.org
 *  字节组数输出流 
 *  ByteArrayOutputStream:
 *     可以将字节输入流最终转换成一个字节数组 ：
 *     此时，字节数组中存放的就是字节输入流中所有的字节。
 */
public class ByteArrayOutputStreamTest {
	public static void main(String[] args) {
		try {
			/** 定义一个文件对象 */
			File file = new File("src/org/fkjava/byteArray/ByteArrayOutputStreamTest.java");
			/** 定义文件对象的字节输入流  */
			InputStream is = new FileInputStream(file);
			
//			/** 定义一个字节数组输出流 */
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			
			/** 定义一个桶  */
			byte[] buffer = new byte[1024];
			int len  = 0 ;
			while((len = is.read(buffer))!=-1){
				baos.write(buffer, 0, len);
			}
			
			/** 将字节数组输出流打成一个字节数组  
			 *     Android java 通信  
			 *     a.jpg ---- byte[]
			 *  wenJian 其实就是 ByteArrayOutputStreamTest.java所有内容数据的字节
			 *  */
			byte[] wenJian = baos.toByteArray();
			
//            byte[] wenJian = new byte[is.available()];
//            is.read(wenJian);
            
			
			
			
			/** 将文件字节数组 转换成文件内容        */
			String result = new String(wenJian,0,wenJian.length,"UTF-8");
			
			System.out.println(result);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}






