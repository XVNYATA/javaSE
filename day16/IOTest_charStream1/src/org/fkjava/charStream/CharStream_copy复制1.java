package org.fkjava.charStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年5月2日上午10:06:29
 * @From www.fkjava.org
 * 
 */
public class CharStream_copy复制1 {
	
	public static void main(String[] args)  {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			/** 定义一个文件对象 */
			File srcFile = new File("D:/fkjava/ceshi.txt");
			/** 定义一个字符流的输入管道 ：将文件字符输入到内存中 */
			fr = new FileReader(srcFile);
			
			/** 定义一个文件对象 */
			File destFile = new  File("src/org/fkjava/charStream/ceshi.txt");
			fw = new FileWriter(destFile);
			
			/** 定义一个缓冲桶 */
			char[] buffer = new char[512];
			int len = 0 ; // 定义这个桶每次装了多少水
			while((len = fr.read(buffer)) > 0){
				/** 往输出管道中倒水：桶装了多少水就倒多少 */
				fw.write(buffer, 0, len);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			    // 如果流没有关闭 应该关闭
				try {
					if(fr!=null)fr.close();
					if(fw!=null)fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}
}









