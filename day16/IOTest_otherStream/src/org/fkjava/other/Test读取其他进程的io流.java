package org.fkjava.other;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class Test读取其他进程的io流 {
	public static void main(String[] args) throws Exception {
	    /** 网络资源也是一个进程 :
	     * 定义一个网络请求地址 
	     * CCIE
	     *  */
		URL url = new URL("http://www.fkjava.org/upload/teacher/1b8f3d8a08a41ca6c99d159706219881.jpg");
		
		/** 从网络进程中获取一个输入流 :*/
		InputStream is = url.openStream();
		
		BufferedInputStream bis = new BufferedInputStream(is);
		
		/** 定义一个缓冲输出流 */
		BufferedOutputStream bos  = 
				new BufferedOutputStream(new FileOutputStream(new File("D:/ligang.jpg")));
		
		/** 定义一个桶 */
		byte[] buffer = new byte[1024];
		int len  = 0 ;
		while((len = bis.read(buffer))!=-1){
			bos.write(buffer, 0, len);
		}
		
		bis.close();
		bos.close();
		
		
		
	}
}
