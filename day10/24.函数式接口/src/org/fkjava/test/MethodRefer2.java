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
interface MyTest
{
	String test(String a , int b , int c);
}

public class MethodRefer2
{
	public static void main(String[] args)
	{

		// 3. 引用某类对象的实例方法，substring(b,c)从b开始截取到c
		// 下面代码使用Lambda表达式创建MyTest对象
//		MyTest mt = (a , b , c) -> a.substring(b , c);
		// 方法引用代替Lambda表达式：引用某类对象的实例方法。
		// 函数式接口中被实现方法的第一个参数作为调用者，
		// 后面的参数全部传给该方法作为参数。
		MyTest mt = String::substring;
		String str = mt.test("Java I Love you" , 2 , 9);
		System.out.println(str); // 输出:va I Lo


	}
}
