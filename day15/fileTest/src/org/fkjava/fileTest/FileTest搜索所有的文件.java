package org.fkjava.fileTest;

import java.io.File;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016��4��30������10:29:44
 * @From www.fkjava.org
 *  �ҳ�ĳ��Ŀ¼�����е��ļ�·�� 
 */
public class FileTest�������е��ļ� {
	
	public static void main(String[] args) {
		/** ��ȡһ���ļ����� */
		File file = new File("D:\\fkjava");
		/** ����·������·���µ��ļ� */
		searchFile(file);
		
	}
	
	/**
	 * ����·������·���µ��ļ� 
	 * @param file
	 */
	public static void searchFile(File file){
		/** ��ȡ��ǰ�ļ����µ������ļ��б� */
		File[] files = file.listFiles();
		/** �����ļ��� */
		for(File f : files){
			//System.out.println(f.getPath());
			if(f.isDirectory()){
				/** ������ļ���Ӧ�ü������� */
				searchFile(f);
			}else{
				System.out.println("�ҵ��ļ���"+f.getPath());
				
			}
		}
	}
}



