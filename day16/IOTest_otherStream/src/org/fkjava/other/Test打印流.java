package org.fkjava.other;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * @Author xlei 
 * @Version 1.0
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Date 2016年5月2日下午3:52:38
 * @From http://www.fkjava.org
 *  
 */
public class Test打印流 {
	public static void main(String[] args) {
		PrintWriter ps = null;
		try {
			File file = new File("D:/fkjava/fkjava.txt");
			
			/** 提供一个输出流管道  */
			OutputStream os = new FileOutputStream(file);
			
			/** 把输出管道转换成打印流 */
			ps = new PrintWriter(os);
			
		    ps.write("你好");
		    ps.write("你好");
		    ps.write(97);
			
		    ps.println(97);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(ps!=null)ps.close();
		}
		
		
		
		
	}
}
