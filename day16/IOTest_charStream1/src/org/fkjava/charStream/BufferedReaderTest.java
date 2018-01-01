package org.fkjava.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年5月2日上午11:45:26
 * @From www.fkjava.org
 * 
 */
public class BufferedReaderTest {
	public static void main(String[] args) {
		try(
				/** 只能放置需要释放的资源 ：会自动释放资源 */
				
				/** 缓冲字符输入流 */
//				BufferedReader br = 
//						new BufferedReader(new FileReader(new File("D:/fkjava/user.txt")));
				BufferedReader br = 
						new BufferedReader(new InputStreamReader(new FileInputStream(new File("D:/fkjava/user.txt")),"GBK"));
				
				/** 缓冲字符输出流  */
				BufferedWriter bw = 
						new BufferedWriter(new FileWriter(new File("D:/userx1.txt")));
			) {
//			File srcFile = new File("D:/fkjava/user.txt");
//			/** 字符输入流 */
//			FileReader fr = new FileReader(srcFile);
//			/** 字符输入流转出成缓冲字符流  */
//			BufferedReader br = new BufferedReader(fr);
			
			char[] buffer = new char[32];
			int len  = 0 ;
			/**
			 * len = br.read(buffer) :从缓冲字符输入流中读取数据装入到桶中
			 *                        如果装到了水就返回读了多少个字符 
			 *                        
			 *                        如果流已经读取完了 返回 -1
			 * 
			 * 
			 * */
			while((len = br.read(buffer)) != -1){
				bw.write(buffer, 0, len);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
