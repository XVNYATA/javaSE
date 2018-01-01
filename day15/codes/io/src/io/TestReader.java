package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestReader {

	public static void main(String[] args) {
		String name = "/home/data/workspace/teaching/2.teach/J1604/JavaSE/day15/笔记.txt";
		// 通常读取文件，是先创建InputStream，然后包装成Reader，最后需要一行行读取数据，可以再把Reader包装成BufferedReader。
		try (InputStream is = new FileInputStream(name);
				InputStreamReader isr = new InputStreamReader(is, "GBK");
				BufferedReader reader = new BufferedReader(isr)) {
			// 利用BufferedReader可以直接读取一行
			// 如果没有读取到数据、数据已经全部读完，返回null
			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);

				line = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
