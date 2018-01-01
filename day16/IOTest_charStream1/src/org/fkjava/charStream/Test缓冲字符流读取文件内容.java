package org.fkjava.charStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年5月2日下午2:01:29
 * @From www.fkjava.org
 * 
 */
public class Test缓冲字符流读取文件内容 {
	public static void main(String[] args) {
		try {
			File file = new File("D:/xlei.txt");
			
			/** 字节流转换成字符流  */
//			InputStreamReader isr = new InputStreamReader(new FileInputStream(file),"UTF-8");
		    
			FileReader fw = new FileReader(file);
			
			/** 把字符输入流转换成缓冲字符输入流 */
			BufferedReader br = new BufferedReader(fw);
			
			/** 循环一行一行的读取字符输入流  */
			String line  = null;
			while((line = br.readLine())!=null){
				System.out.println("----"+line);
			}
		   
//			char[] buffer = new char[20];
//			int len  = 0 ;
//			while((len = fw.read(buffer))!=-1){
//				System.out.print("----"+new String(buffer,0,len));
//			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}





