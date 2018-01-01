package org.fkjava.other;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;


/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年5月2日下午3:47:23
 * @From www.fkjava.org
 * 
 */
public class Test标准输入 {
	public static void main(String[] args) throws Exception {
		// System.in:标准输入流也就是键盘的输入实际上就是一个流 
	    InputStreamReader isr = new InputStreamReader(System.in);
	    
	    System.out.println(isr.read());
	    
	    
	}
}
