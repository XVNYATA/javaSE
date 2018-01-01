package org.fkjava.th;

/**
 * @Author xlei 
 * @Version 1.0
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Date 2016年5月3日下午2:16:56
 * @From http://www.fkjava.org
 *  没有任何好处 只是创建线程  
 */
public class ThreadTest extends Thread {
	
	/** 定义一个线程方法  */
	@Override
	public void run() {
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("===新线程："+i);
			if(i == 10){
				Thread.yield();  // 我此刻不要CPU了
			}
		}
	}
	
	
	public static void main(String[] args) {
		
//		/** 1.创建一个线程    */
		ThreadTest th = new ThreadTest();
		th.start(); // 执行线程
		
		
		for(int i = 0 ; i < 100 ; i++){
			System.out.println("主线程："+i);
		}
		
	}


}
