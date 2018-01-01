package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestReadFile {

	public static void main(String[] args) {
		// 用来演示读取文件的一个基本的操作

		// 1.确定要读取的文件名（可以包含完整的路径）
		String name = "/home/data/workspace/teaching/2.teach/J1604/JavaSE/day15/笔记.txt";

		try {
			// 2.创建输入流
			InputStream in = new FileInputStream(name);

			// 3.读取一个字节
			int b = in.read();

			// 4.循环不断读取
			while (b != -1) {
				System.out.print((char) b);

				b = in.read();
			}

			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
