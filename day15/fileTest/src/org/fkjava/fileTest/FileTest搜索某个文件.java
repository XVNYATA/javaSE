package org.fkjava.fileTest;

import java.io.File;

public class FileTest搜索某个文件 {
	
	public static void main(String[] args) {
		
		File file = new File("D:\\soft");
		
		searchFilePath(file, ".exe");
		
	}
	
	/**
	 * @param file     文件夹
	 * @param fileName 查找的文件
	 */
	public static void searchFilePath(File file,String fileName){
		/** 遍历d盘所有的文件  */
		File[] files = file.listFiles();
		
		for(File f : files ){
			if(f.isDirectory()){
				/** 如果f是文件夹应该到f下也查找一下 */
				searchFilePath(f, fileName);
			}else{
				/** 如果当前找到的文件的文件名包含了“fileName” 这个文件
				 *  那么这个文件就是我们想要的
				 *   Integer.valueOf("1") ;
				 *   String name = "疯狂软件";
				 *   name.indexOf("软件") 不包含返回-1
				 *   
				 * */
				if(f.getName().indexOf(fileName)!=-1){
					System.out.println(f.getPath());
				}
				
//				if(f.getName().indexOf(fileName)!=-1){
//					try {
//						/** 找到了匹配的文件   */
//						System.out.println(f.getPath());
//						/** 获取运行时对象 */
//						Runtime runtime = Runtime.getRuntime();
				        // 找到了该执行文件 并且自动启动它
//						runtime.exec(f.getPath());
//						System.exit(0);
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//					
//					
//				}
			}
		}
	}
}
