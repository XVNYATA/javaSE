package org.fkjava.fileTest;

import java.io.File;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年4月30日上午10:29:44
 * @From www.fkjava.org
 *  找出某个目录下所有的文件路径 
 */
public class FileTest搜索所有的文件 {
	
	public static void main(String[] args) {
		/** 获取一个文件对象 */
		File file = new File("D:\\fkjava");
		/** 根据路径搜索路径下的文件 */
		searchFile(file);
		
	}
	
	/**
	 * 根据路径搜索路径下的文件 
	 * @param file
	 */
	public static void searchFile(File file){
		/** 获取当前文件夹下的所有文件列表 */
		File[] files = file.listFiles();
		/** 遍历文件夹 */
		for(File f : files){
			//System.out.println(f.getPath());
			if(f.isDirectory()){
				/** 如果是文件夹应该继续遍历 */
				searchFile(f);
			}else{
				System.out.println("找到文件："+f.getPath());
				
			}
		}
	}
}



