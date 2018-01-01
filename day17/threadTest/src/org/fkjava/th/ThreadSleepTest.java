package org.fkjava.th;

/**
 * @Author xlei 
 * @Version 1.0
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Date 2016年5月3日下午2:40:14
 * @From http://www.fkjava.org
 *  
 */
public class ThreadSleepTest {
	public static void main(String[] args) throws Exception {
		
		Thread.sleep(3000);
		
		new Thread(){
			@Override
			public void run() {
				for(int i  = 0 ; i < 100 ; i++){
					System.out.println(Thread.currentThread().getName()+"-->"+i);
					if(i == 50){
						try {
							System.out.println("线程被阻塞，正在sleep...");
							// 当前线程睡眠5s
							Thread.sleep(3000);
							
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}.start();
		
		
	}
}
