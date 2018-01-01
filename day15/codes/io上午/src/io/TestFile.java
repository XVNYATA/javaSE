package io;

import java.io.File;

public class TestFile {

	public static void main(String[] args) {
		File f1 = new File("/home/data/workspace/teaching/2.teach/J1604/JavaSE");
		System.out.println(f1);

		File f2 = new File(f1, "day15");
		System.out.println(f2);

		File f3 = new File(
				"/home/data/workspace/teaching/2.teach/J1604/JavaSE", "day14");
		System.out.println(f3);

		File f4 = new File("day100");
		System.out.println(f4);
		System.out.println(f3.getAbsolutePath());
		System.out.println(f4.getAbsolutePath());

		// 当前目录的上级的上级下面的day1000
		File f5 = new File("../../day1000");
		System.out.println(f5.getAbsolutePath());
		// mkdir 方法表示创建目录
		boolean b = f5.mkdir();
		System.out.println("创建目录结果: " + b);
		
		File f6 = new File( f5, "test/a");
		System.out.println(f6.getAbsolutePath());
		//mkdirs会自动创建父目录
		f6.mkdirs();
	}
}
