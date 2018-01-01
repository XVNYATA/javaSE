package org.fkjava.test;

import org.fkjava.bean.Season;

// 重点掌握
public class TestSeason {

	public static void main(String[] args) {
		// 创建枚举
		Season s1 = Season.SPRING;
		System.out.println(s1);
		
		// 创建枚举,valueOf的参数必须是枚举中的实例
		Season s2 = Season.valueOf("SUMMER");
		System.out.println(s2);
		
		// 创建枚举,使用Enum的静态方法valueOf，第一个参数是返回的类型，第二个参数是枚举的实例
		Season s3 = Enum.valueOf(Season.class, "FALL");
		System.out.println(s3);
		
		/*// 如果枚举中没有参数实例，则会抛出异常
		Season s3 = Season.valueOf("fkjava");
		System.out.println(s3);*/
		
		// values   : 返回一个数组，里面包含了枚举类里面所有的实例
		Season[] ss = Season.values();
		for(Season s : ss){
			System.out.print(s + "\t");
		}
		System.out.println();
		
		// name方法
		System.out.println(s1.name());
		System.out.println(s1.ordinal());
		
		

	}

}
