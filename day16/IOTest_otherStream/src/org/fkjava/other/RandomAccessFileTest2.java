package org.fkjava.other;

import java.io.RandomAccessFile;

/**
 * @Author xlei 
 * @Version 1.0
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Date 2016年5月2日下午4:39:21
 * @From http://www.fkjava.org
 *  内存中在RAM中，随机读写文件内容
 */
public class RandomAccessFileTest2 {
	public static void main(String[] args) {
		try(
			// 参数一：需要读写的文件路径 
			// 参数二：指定读写的权限 ，r只读  rw读写
				// RAM
			 RandomAccessFile raf = new RandomAccessFile("src/org/fkjava/other/RandomAccessFileTest2.java", "rw")	
			) {
			raf.seek(raf.length()); // 寻找读写点
//			raf.write(97);;
//			raf.write(97);;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
