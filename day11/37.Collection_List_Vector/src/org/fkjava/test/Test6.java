package org.fkjava.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Test6 {

	/**
	 * 循环的时候如果修改 集合 的数据，例如删除元素，循环结果会不正确，不会抛出异常
	 * 迭代的时候如果修改 集合 的数据，例如删除元素，或抛出java.util.ConcurrentModificationException
	 * 元素是迭代的最初已经确定迭代的次数，在迭代过程中发生变化，迭代的结果是不确定的，可以认为迭代失败，
	 * 所以抛出异常。
	 * 
	 * 在实际开发过程中，如果在遍历集合数据的时候，需要修改该数据，最好使用循环。
	 * 如果是迭代，删除元素之后，使用break跳出，也不会发送错误。
	 * */
	public static void main(String[] args) {
		List list = new Vector();
		list.add("javase"); // 0
		list.add("javaee"); // 1
		list.add("android"); // 2
		list.add("Oracle"); // 3
		list.add("iOS"); // 4
		
		// 0 javase 1 javaee 2 android 3 Oracle 4 iOS
		// 0 javase 1 android 2 Oracle 3 iOS
		// size原来是5，但是在循环中有一个元素被删除了，size发送变化，遍历集合结果改变了
		// 没有抛出异常
		/*for(int i = 0;i < list.size();i++){
			Object obj = list.get(i);
			// 如果元素是字符串javaee，从集合中删除 
			if(obj.equals("javaee")){
				list.remove(obj);
			}else{
				System.out.println(obj);
			}
		}*/
		
		// 抛出异常
		// java.util.ConcurrentModificationException
		/*for(Object obj : list){
			// 如果元素是字符串javaee，从集合中删除 
			if(obj.equals("javaee")){
				list.remove(obj);
			}else{
				System.out.println(obj);
			}
		}*/
		
		// 抛出异常
		// java.util.ConcurrentModificationException
		Iterator it = list.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			// 如果元素是字符串javaee，从集合中删除 
			if(obj.equals("javaee")){
				list.remove(obj);
			}else{
				System.out.println(obj);
			}
		}
		

	}

}
