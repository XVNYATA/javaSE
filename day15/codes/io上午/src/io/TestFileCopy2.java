package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestFileCopy2 {

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
			// int b = in.read();

			byte[] buffer = new byte[1024];
			// 返回的b表示读取了多少个字节
			int b = in.read(buffer);
			while (b != -1) {
				// 5.把读取到的数据，写出到目标文件。
				// out.write(b);

				// 第二个参数，表示从第几个字节开始写出
				// 第三个参数，表示最多写出多少个字节。读取得到多少个，就写出多少个。
				out.write(buffer, 0, b);

				b = in.read(buffer);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
