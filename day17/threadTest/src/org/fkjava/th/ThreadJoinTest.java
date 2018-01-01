package org.fkjava.th;

public class ThreadJoinTest extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 100 ; i++){
			 System.out.println(Thread.currentThread().getName()+"##"+i);
		}
	}
	
	public static void main(String[] args) {
		
		/** 你老婆 */
		ThreadJoinTest tt = new ThreadJoinTest();
		tt.start();
		
		/** 你 */
		for(int i = 0; i < 100 ; i++){
			 System.out.println(Thread.currentThread().getName()+"##"+i);
			 if(i == 25){
				 /** 锅洗完:让你老婆可以炒菜 */
				 try {
					tt.join();  //  这个main线程就暂停了，必须等到join进来的线程执行完毕才可以接着执行
				} catch (Exception e) {
					e.printStackTrace();
				}
			 }
		}
		
	
	}
}
