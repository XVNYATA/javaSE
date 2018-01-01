package org.fkjava.test;

import javax.swing.*;
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

@FunctionalInterface
interface YourTest
{
	JFrame win(String title);
}

public class MethodRefer3
{
	public static void main(String[] args)
	{
		// 4. 引用构造器
		// 下面代码使用Lambda表达式创建YourTest对象
//		YourTest yt = (String a) -> new JFrame(a);
		// 构造器引用代替Lambda表达式。
		// 函数式接口中被实现方法的全部参数传给该构造器作为参数。
		YourTest yt = JFrame::new;
		JFrame jf = yt.win("我的窗口");
		System.out.println(jf);
	}
}
