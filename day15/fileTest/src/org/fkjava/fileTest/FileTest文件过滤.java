package org.fkjava.fileTest;

import java.io.File;
import java.io.FileFilter;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年4月30日上午11:41:50
 * @From www.fkjava.org
 * 
 */
public class FileTest文件过滤 {
	public static void main(String[] args) {
		
		File file = new File("D:\\soft");
		
		searchFilePath(file, ".exe");
	}
	
	public static void searchFilePath(File file , String fileName){
		
		/** 1.遍历目录
		 *  定义了一个匿名内部类来过滤出想要的文件
		 *  */
	    File[] files = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				if(pathname.isFile()){
					
					/** 包含fileName返回true 不包含fileName返回false */
					if(pathname.getName().contains(fileName)){
						/** 这个文件是我需要的 */
						return true ;
					}else{
						/** 这个文件是不需要的 */
						return false;
					}
				}else{
					searchFilePath(pathname,fileName);
				}
				return false;
			}
		}) ;
	    
	    /** 遍历最终过滤出的文件即可 */
	    for(File f : files){
	    	System.out.println(f.getPath());
	    }
	    
	    
	}
}









