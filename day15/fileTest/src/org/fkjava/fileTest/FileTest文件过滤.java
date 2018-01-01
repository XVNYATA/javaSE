package org.fkjava.fileTest;

import java.io.File;
import java.io.FileFilter;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016��4��30������11:41:50
 * @From www.fkjava.org
 * 
 */
public class FileTest�ļ����� {
	public static void main(String[] args) {
		
		File file = new File("D:\\soft");
		
		searchFilePath(file, ".exe");
	}
	
	public static void searchFilePath(File file , String fileName){
		
		/** 1.����Ŀ¼
		 *  ������һ�������ڲ��������˳���Ҫ���ļ�
		 *  */
	    File[] files = file.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				if(pathname.isFile()){
					
					/** ����fileName����true ������fileName����false */
					if(pathname.getName().contains(fileName)){
						/** ����ļ�������Ҫ�� */
						return true ;
					}else{
						/** ����ļ��ǲ���Ҫ�� */
						return false;
					}
				}else{
					searchFilePath(pathname,fileName);
				}
				return false;
			}
		}) ;
	    
	    /** �������չ��˳����ļ����� */
	    for(File f : files){
	    	System.out.println(f.getPath());
	    }
	    
	    
	}
}









