package org.fkjava.test;

public class Test2 {

	public static void main(String[] args) {
		String s = "100";
		// parseInt("") 将字符串转成整形 
		Integer i = Integer.parseInt(s);
		System.out.println(i);

		// 把一个整形转成字符串
		String s2 = Integer.toString(100);
		String s3 = 100 + "";
		
		
		String s4 = "9.9";
		Double d = Double.parseDouble(s4);
		System.out.println(d);
		
	}

}
