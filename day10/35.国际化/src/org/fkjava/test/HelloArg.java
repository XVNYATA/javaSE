package org.fkjava.test;
import java.util.*;
import java.text.*;
/**
 * Description:
 * <br/>网站: <a href="http://www.crazyit.org">疯狂Java联盟</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author Yeeku.H.Lee kongyeeku@163.com
 * @version 1.0
 */
public class HelloArg
{
	public static void main(String[] args)
	{
		// 定义一个Locale变量
		Locale currentLocale = Locale.getDefault(Locale.Category.FORMAT);
		System.out.println(currentLocale);
		// 根据Locale加载语言资源
		// msg=Hello,{0}!Today is {1}.
		// {0}表示第一个占位符，{1}表示第二个占位符
		ResourceBundle bundle = ResourceBundle
			.getBundle("myMess" , currentLocale);
		// 取得已加载的语言资源文件中msg对应消息
		String msg = bundle.getString("msg");
		// 使用MessageFormat为带占位符的字符串传入参数
		System.out.println(MessageFormat.format(msg
			, "yeeku" , new Date()));
	}
}
