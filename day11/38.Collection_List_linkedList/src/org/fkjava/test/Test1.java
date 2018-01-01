package org.fkjava.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test1 {

	/**
	 * 测试LinkedList
	 * getFirst() 、getLast() 
	peek()、peekFirst()、peekLast() 
	poll() 、pollFirst()、pollLast() 
	removeFirst() 、removeLast() 
	 * */
	public static void main(String[] args) {
		// 获取基于双向链表的LinkedList对象
		LinkedList list = new LinkedList();
		
		list.add("javase");
		list.add("javaee");
		list.add("android");
		
		System.out.println(list);
		
		// 返回此列表的第一个元素 javase
		System.out.println(list.getFirst());
		// 返回此列表的最后一个元素。 android
		System.out.println(list.getLast());
		
		// 获取但不移除此列表的头（第一个元素）。javase
		System.out.println(list.peek());
		 // 获取但不移除此列表的第一个元素；如果此列表为空，则返回 null  javase
		System.out.println(list.peekFirst());
		//  获取但不移除此列表的最后一个元素；如果此列表为空，则返回 null。 android
		System.out.println(list.peekLast());
		System.out.println(list);
		System.out.println("----------------------");
		// 获取并移除此列表的头（第一个元素）
//		System.out.println(list.poll());
		// 获取并移除此列表的第一个元素；如果此列表为空，则返回 null。
//		System.out.println(list.pollFirst());
		// 获取并移除此列表的最后一个元素；如果此列表为空，则返回 null。
//		System.out.println(list.pollLast());
//		System.out.println(list);
		
//		移除并返回此列表的第一个元素。
		System.out.println(list.removeFirst());
		// 移除并返回此列表的最后一个元素。
		System.out.println(list.removeLast());
		
		System.out.println(list);
		

	}

}
