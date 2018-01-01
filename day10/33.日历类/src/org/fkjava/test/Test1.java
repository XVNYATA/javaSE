package org.fkjava.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		System.out.println(c.getTime());
		// 获取常量
		System.out.println(c.get(Calendar.YEAR));
		// 注意：月是从0开始
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DATE));
		// 12小时制
		System.out.println(c.get(Calendar.HOUR));
		// 24小时制
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		
		// 格式化
		SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日HH点mm分ss秒");
		// getTime返回的是日历的Date对象
		Date d = c.getTime();
		System.out.println(df.format(d));
	}

}
