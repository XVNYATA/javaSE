package org.fkjava.fileTest;

import java.io.File;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016��4��30������10:24:55
 * @From www.fkjava.org
 * 
 */
public class FileTest�ļ����� {
	public static void main(String[] args) {
		/** ��ȡһ���ļ����� */
		File file = new File("D:\\fkjava\\�༶\\j1602");
		
		/** file.listFiles():��ȡ��ǰ�ļ��µ��ļ��б� */
		File[] files = file.listFiles();
		
		/** files = [f1,f2,f3,...]
		 *              
		 * */
	    for(File f : files){
	    	System.out.println(f.getName());
	    }
		
		
	}
}





