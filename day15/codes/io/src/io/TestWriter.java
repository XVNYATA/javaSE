package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestWriter {

	public static void main(String[] args) {
		// 1.确定文件写到哪个位置
		String name = "/tmp/io/w.txt";

		// 2.创建输出流
		try (OutputStream out = new FileOutputStream(name);
				Writer w = new OutputStreamWriter(out, "GBK");
				BufferedWriter writer = new BufferedWriter(w);) {

			writer.write("这个是字符串");
			writer.newLine();
			writer.write("再来一行");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
