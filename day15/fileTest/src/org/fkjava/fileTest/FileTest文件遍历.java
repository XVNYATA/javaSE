package org.fkjava.fileTest;

import java.io.File;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年4月30日上午10:24:55
 * @From www.fkjava.org
 * 
 */
public class FileTest文件遍历 {
	public static void main(String[] args) {
		/** 获取一个文件对象 */
		File file = new File("D:\\fkjava\\班级\\j1602");
		
		/** file.listFiles():获取当前文件下的文件列表 */
		File[] files = file.listFiles();
		
		/** files = [f1,f2,f3,...]
		 *              
		 * */
	    for(File f : files){
	    	System.out.println(f.getName());
	    }
		
		
	}
}





