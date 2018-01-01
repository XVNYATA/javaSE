package org.fkjava.th;

/**
 * @Author xlei 
 * @Version 1.0
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Date 2016年5月3日下午3:19:50
 * @From http://www.fkjava.org
 *  线程优先级  
 */
public class Thread优先级 {
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
		t1.setPriority(1);
		
		t.start();
		t1.start();
		
	}
}
