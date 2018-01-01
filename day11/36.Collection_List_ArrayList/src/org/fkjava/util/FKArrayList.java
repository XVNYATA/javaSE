package org.fkjava.util;

import java.util.Arrays;

/***
 * 
 *  思想提升案例
 *  模拟SUN公司的ArrayList的实现
 *  public boolean add(E e)
 *  public int size()
 *  public E get(int index)
 *  
 */
public class FKArrayList {
	
	// List 接口的大小可变数组的实现。
	private Object[] objs;
	private int index;
	
	public FKArrayList() {
		super();
		// 构造一个初始容量为 10 的空列表。
		objs = new Object[2];
		this.index = 0;
	}

	public boolean add(Object e){
		// 判断数组是否已满，如果已满，自动扩展
		if(this.index == objs.length){
			System.out.println("需要自动扩展");
			System.out.println("old : " + Arrays.toString(objs));
			Object[] extendArray = new Object[objs.length * 2];
			for(int i = 0;i < objs.length;i++){
				// extendArray[0] = objs[0];
				extendArray[i] = objs[i];
			}
			System.out.println("new : " + Arrays.toString(extendArray));
			objs = extendArray;
		}
		// 把传进来的e保存到数组的某一个位置
		objs[this.index] = e;
		this.index++;
		return true;
	}
	
	// 返回此列表中的元素数。
	public int size(){
		return this.index;
	}
	
	// 返回此列表中指定位置上的元素。
	public Object get(int aa){
		return objs[aa];
	}

	// [javase, javaee, android]
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		// 遍历元素
		for(int i = 0;i < this.index;i++){
			s.append(objs[i]).append(",");
		}
		s.deleteCharAt(s.length() - 1);
		s.append("]");
		return s.toString();
	}

}
