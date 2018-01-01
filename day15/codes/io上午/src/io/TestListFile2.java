package io;

import java.io.File;

public class TestListFile2 {

	public static void main(String[] args) {
		String name = "/home/data/documents/java/javase-8-api-docs";

		// 创建File对象
		File file = new File(name);

		listFiles(file);
	}

	private static void listFiles(File file) {
		// 获得file里面所有的内容
		File[] files = file.listFiles(x -> {
			if (x.isDirectory()) {
				// 如果是文件夹，只需要返回true，就会在下面的循环里面递归
				return true;
			} else if (x.getName().indexOf("Stream") > -1) {
				// x的文件名包含了Stream关键字
				return true;
			} else {
				// 不包含
				return false;
			}
		});
		for (File f : files) {
			// System.out.println(f);
			// 判断f是否为目录，如果是目录则进行下一级的文件查找
			if (f.isDirectory()) {
				System.out.println("目录：" + f.getAbsolutePath());
				listFiles(f);
			} else {
				// 如果不是目录，则输出文件的绝对路径
				System.out.println("文件: " + f.getAbsolutePath());
			}
		}
	}
}
