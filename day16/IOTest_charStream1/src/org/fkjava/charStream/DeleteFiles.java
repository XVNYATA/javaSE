package org.fkjava.charStream;

import java.io.File;

public class DeleteFiles {
	public static void main(String[] args) throws Exception {
		/** 1.删除的文件夹 */
		File file = new File("D://a");
		
//		deleteFile(file);
		
		
	}
	
	/**
	 * 给啥删啥
	 * @param file
	 */
	public static void deleteFile(File file){
		
		//1.判断是否是文件  
		if(file.exists()&&file.isFile()){
			/** 如果是文件，并且存在直接删除 */
			file.delete();
		}else{
			/** 说明file是文件夹：只能删除空的文件夹  */
			File[] files = file.listFiles();
	
			if(files == null || files.length == 0){
				/** 此时就是一个空文件夹 */
				file.delete();
			}else{
				for(File f : files){
					if(f.exists()&&f.isFile()){
						/** 如果是文件，并且存在直接删除 */
						f.delete();
					}else{
						/** 删除当前的文件夹 中的内容*/
						deleteFile(f);
						/** 文件夹已经清空 可以删除自己 */
						f.delete();
					}
				}
			}
			
		}
		
		file.delete();
		
	}
	
}
