package org.fkjava.test;

public class TestSplit {

	public static void main(String[] args) {
		String s = "hello,world,java,ios";
		System.out.println(s);
		// 根据“,”分隔字符串
		String[] temp = s.split(",");
		System.out.println(temp.length);
		for(String t : temp){
			System.out.print(t + "\t");
		}
	}

}
