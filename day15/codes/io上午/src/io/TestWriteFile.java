package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestWriteFile {

	public static void main(String[] args) {
		// 1.确定文件写到哪个位置
		String name = "/tmp/io/output.txt";

		try {
			// 2.创建输出流
			OutputStream out = new FileOutputStream(name);

			// 3.循环不断写出数据，0~9
			for (int i = 0; i < 10; i++) {
				out.write(i + '0');
			}

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
