package org.fkjava.fileTest;

import java.io.File;
import java.util.Date;

/**
 * @Author xlei
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Version 1.0
 * @Time 2016年4月30日上午9:21:56
 * @From www.fkjava.org
 *  文件操作的常用方法 
 */
public class FileTest常用api {
	public static void main(String[] args) {
		
		/** 根据文件的路径得到对应文件的对象 */
		File file = new File("D:\\j1603.txt");
		
		System.out.println(file.getName());
		
		/** 获取文件的路径 */
		System.out.println(file.getPath());
		
		/** 判断文件是否是文件夹:如果是文件夹返回true，如果不是文件夹返回false */
		boolean flag = file.isDirectory();
		System.out.println(flag);
		
		/** 判断当前对象是文件还是文件夹 ，文件返回true 文件夹返回false*/
		System.out.println(file.isFile());
		
//		boolean result = file.delete();
//		System.out.println(result);
		
		System.out.println(file.getParent());
		
		/** 判断当前文件对象是否存在*/
		System.out.println(file.exists());
		file.delete();
		System.out.println(file.exists()); // false
		
		System.out.println("================================");
		
		
		File file1 = new File("D:\\fkjava");
		/** 如果是文件夹 返回文件夹的名称 */
		System.out.println(file1.getName());
		
		System.out.println(file1.exists()); // 判断文件是否存在 
		
		System.out.println(file1.isDirectory());
		
		System.out.println(file1.isFile());
		
		System.out.println(file1.getPath());
		
		/** 获取上一级目录*/
		System.out.println(file1.getParent());
		
		System.out.println(file1.canRead());
		
		System.out.println("================================");
		/** 相对路径 :就是到工程项目的路径  : 工程所在的路径  C:\dlei\code\j1511\fileTest
		 *  如果不是绝对路径就是相对路径
		 * */
		File file2 = new File("src/org/fkjava/fileTest/abc.txt");
		/** 获取文件对象所在的绝对路径 */
		System.out.println(file2.getAbsolutePath());
		
		System.out.println(file2.exists());
		
		/** 就是获取当前路径；如果是定位文件的是绝对路径返回绝对路径，如果返回的是相对路径返回相对路径*/
		System.out.println(file2.getPath());
		
		System.out.println(file2.isDirectory());
        
		System.out.println(file2.isFile());
		
		System.out.println(file2.length()); // 文件拥有的字节数大小 2B
		
		/** 获取文件的最后修改时间 */
		System.out.println(new Date(file2.lastModified()));
		
		System.out.println("===============================");
		/** 创建文件目录  */
		File file3 = new File("D:/fkjava/a/b/c/fkjava.txt");
		System.out.println(file3.exists());
		
	//	file3.mkdir(); // 只能创建一个目录 
		
		file3.mkdirs(); // 创建多级文件夹 不能创建文件
		
	}
}





