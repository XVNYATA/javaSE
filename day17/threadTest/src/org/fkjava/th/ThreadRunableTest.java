package org.fkjava.th;

/**
 * @Author xlei 
 * @Version 1.0
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Date 2016年5月3日下午2:07:20
 * @From http://www.fkjava.org
 *  线程类  : 实现Runable接口  jdk1.7
 */
public class ThreadRunableTest implements Runnable  {
	
	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++){
			System.out.println(Thread.currentThread().getName()+"->"+i);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		/** 开启一个子线程  */
		ThreadRunableTest th = new ThreadRunableTest();
		/** 把实现Runnable的类，转成一个线程  */
		Thread td = new Thread(th);
		Thread td1 = new Thread(th);
		/** 执行线程  */
		td.start();
		td1.start();
		
		
		for(int i = 0 ; i < 100 ; i++){
			System.out.println(Thread.currentThread().getName()+"->"+i);
		}
	}

	
}



