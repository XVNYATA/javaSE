package org.fkjava.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		// 1. 通过无参数构造器创建Date,默认当前时间
		Date d1 = new Date();
		// 返回Date对象里面保存的毫秒数。
		System.out.println(d1.getTime());
		// 2. 使用有参数构造器创建Date
		long l = System.currentTimeMillis();
		Date d2 = new Date(l);
		System.out.println(d2.getTime());
		// Mon May 30 16:15:18 CST 2016
		System.out.println(d1);
		
		// 格式化
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = df.format(d1);
		System.out.println(str);

	}

}
