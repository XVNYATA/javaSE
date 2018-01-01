package org.fkjava.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 {

	/**
	 * 集合的缺陷
	 * */
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add("javase");
		list.add("android");
		list.add(100);
		list.add(200);
		
		for(int i =0;i < list.size();i++){
			String s = (String)list.get(i);
			System.out.println(s);
		}

	}

}
