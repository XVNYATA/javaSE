package org.fkjava.th;

/**
 * @Author xlei 
 * @Version 1.0
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Date 2016年5月3日下午3:34:57
 * @From http://www.fkjava.org
 *  
 */
public class Thread后台线程 {
	public static void main(String[] args) {
		Thread t = new Thread(){
			public void run() {
				for(int i = 0 ; i < 100 ; i++){
					System.out.println(Thread.currentThread().getName()
							+"-->"+i);
				}
			};
		};
		t.setPriority(10);
		

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0 ; i < 100 ; i++){
					System.out.println(Thread.currentThread().getName()
							+"-->"+i);
				}
			}
		});
		t1.setPriority(5);
		
		t.setDaemon(true); // 把这个线程变成后台线程
		t.start();
		t1.start();
		
		
	}
}







