package org.fkjava.fileTest;

import java.io.File;

public class FileTest����ĳ���ļ� {
	
	public static void main(String[] args) {
		
		File file = new File("D:\\soft");
		
		searchFilePath(file, ".exe");
		
	}
	
	/**
	 * @param file     �ļ���
	 * @param fileName ���ҵ��ļ�
	 */
	public static void searchFilePath(File file,String fileName){
		/** ����d�����е��ļ�  */
		File[] files = file.listFiles();
		
		for(File f : files ){
			if(f.isDirectory()){
				/** ���f���ļ���Ӧ�õ�f��Ҳ����һ�� */
				searchFilePath(f, fileName);
			}else{
				/** �����ǰ�ҵ����ļ����ļ��������ˡ�fileName�� ����ļ�
				 *  ��ô����ļ�����������Ҫ��
				 *   Integer.valueOf("1") ;
				 *   String name = "������";
				 *   name.indexOf("���") ����������-1
				 *   
				 * */
				if(f.getName().indexOf(fileName)!=-1){
					System.out.println(f.getPath());
				}
				
//				if(f.getName().indexOf(fileName)!=-1){
//					try {
//						/** �ҵ���ƥ����ļ�   */
//						System.out.println(f.getPath());
//						/** ��ȡ����ʱ���� */
//						Runtime runtime = Runtime.getRuntime();
				        // �ҵ��˸�ִ���ļ� �����Զ�������
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
