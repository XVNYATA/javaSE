package io;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class TestStreamRedirect {

	public static void main(String[] args) throws FileNotFoundException,
			UnsupportedEncodingException {

		PrintStream err = new PrintStream("/tmp/io/err.txt", "GBK");
		// 把标准错误输出流，重定向到自定义的流里面
		System.setErr(err);

		PrintStream out = new PrintStream("/tmp/io/out.txt", "UTF-8");
		// 把标准输出流，重定向到自定义的流里面
		System.setOut(out);

		System.out.println("向控制台输出的普通信息");
		System.err.println("向控制台输出的错误信息");
	}
}
