package org.fkjava.th.get;

/**
 * @Author xlei 
 * @Version 1.0
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Date 2016年5月3日下午3:59:49
 * @From http://www.fkjava.org
 *  
 */
public class GetMoney {
	public static void main(String[] args) {
		
			Account acc = new Account(110, 10000);
			
			Thread t0  = new Thread(new Runnable() {
				@Override
				public void run() {
					acc.getMoney(10000);
				}
			});
			

			Thread t1  = new Thread(new Runnable() {
				@Override
				public void run() {
					acc.getMoney(10000);
				}
			});
			
			
			t1.start();
			t0.start();
		
	}
}
