package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestFileCopy {

	public static void main(String[] args) {
		// 1.确定要复制的源文件
		// /home/data/workspace/teaching/2.teach/J1604/JavaSE/day15/视频/02-输入、输出流的简单使用.mp4
		String sourceFileName = "/home/data/workspace/teaching/2.teach/J1604/JavaSE/day15/视频/02-输入、输出流的简单使用.mp4";
		// 2.确定把源文件复制到哪个地方(存储目标)
		// /tmp/io/a.mp4
		String targetFileName = "/tmp/io/a.mp4";
		// 3.分别创建输入流、输出流
		try (InputStream in = new FileInputStream(sourceFileName);
				OutputStream out = new FileOutputStream(targetFileName)) {
			// 4.读取源文件，把读取到的数据放在内存中的一个变量里面。
			int b = in.read();
			while (b != -1) {
				// 5.把读取到的数据，写出到目标文件。
				out.write(b);
				
				b = in.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
