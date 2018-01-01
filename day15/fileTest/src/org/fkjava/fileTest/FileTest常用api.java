package org.fkjava.fileTest;

import java.io.File;
import java.util.Date;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016��4��30������9:21:56
 * @From www.fkjava.org
 *  �ļ������ĳ��÷��� 
 */
public class FileTest����api {
	public static void main(String[] args) {
		
		/** �����ļ���·���õ���Ӧ�ļ��Ķ��� */
		File file = new File("D:\\j1603.txt");
		
		System.out.println(file.getName());
		
		/** ��ȡ�ļ���·�� */
		System.out.println(file.getPath());
		
		/** �ж��ļ��Ƿ����ļ���:������ļ��з���true����������ļ��з���false */
		boolean flag = file.isDirectory();
		System.out.println(flag);
		
		/** �жϵ�ǰ�������ļ������ļ��� ���ļ�����true �ļ��з���false*/
		System.out.println(file.isFile());
		
//		boolean result = file.delete();
//		System.out.println(result);
		
		System.out.println(file.getParent());
		
		/** �жϵ�ǰ�ļ������Ƿ����*/
		System.out.println(file.exists());
		file.delete();
		System.out.println(file.exists()); // false
		
		System.out.println("================================");
		
		
		File file1 = new File("D:\\fkjava");
		/** ������ļ��� �����ļ��е����� */
		System.out.println(file1.getName());
		
		System.out.println(file1.exists()); // �ж��ļ��Ƿ���� 
		
		System.out.println(file1.isDirectory());
		
		System.out.println(file1.isFile());
		
		System.out.println(file1.getPath());
		
		/** ��ȡ��һ��Ŀ¼*/
		System.out.println(file1.getParent());
		
		System.out.println(file1.canRead());
		
		System.out.println("================================");
		/** ���·�� :���ǵ�������Ŀ��·��  : �������ڵ�·��  C:\dlei\code\j1511\fileTest
		 *  ������Ǿ���·���������·��
		 * */
		File file2 = new File("src/org/fkjava/fileTest/abc.txt");
		/** ��ȡ�ļ��������ڵľ���·�� */
		System.out.println(file2.getAbsolutePath());
		
		System.out.println(file2.exists());
		
		/** ���ǻ�ȡ��ǰ·��������Ƕ�λ�ļ����Ǿ���·�����ؾ���·����������ص������·���������·��*/
		System.out.println(file2.getPath());
		
		System.out.println(file2.isDirectory());
        
		System.out.println(file2.isFile());
		
		System.out.println(file2.length()); // �ļ�ӵ�е��ֽ�����С 2B
		
		/** ��ȡ�ļ�������޸�ʱ�� */
		System.out.println(new Date(file2.lastModified()));
		
		System.out.println("===============================");
		/** �����ļ�Ŀ¼  */
		File file3 = new File("D:/fkjava/a/b/c/fkjava.txt");
		System.out.println(file3.exists());
		
	//	file3.mkdir(); // ֻ�ܴ���һ��Ŀ¼ 
		
		file3.mkdirs(); // �����༶�ļ��� ���ܴ����ļ�
		
	}
}





