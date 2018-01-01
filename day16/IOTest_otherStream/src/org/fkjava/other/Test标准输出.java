package org.fkjava.other;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年5月2日下午3:10:42
 * @From www.fkjava.org
 * 
 */
public class Test标准输出 {
	public static void main(String[] args) throws Exception {
		PrintStream ps = new PrintStream(new File("src/org/fkjava/other/user5.txt"));
	
		System.setOut(ps); //重定向标准输出:将标准输出改到输出到ps对应文件中
        
        System.out.println("aaaaaa");
		
		ps.close();
	
	}
}
