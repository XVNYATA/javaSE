package org.fkjava.th.get;

import javax.sql.rowset.spi.SyncFactory;

public class Account {
	private int id ;
	private double money ;
	
	public Account(int id, double money) {
		this.id = id;
		this.money = money;
	}
	
	public double getMoney(double getMoney){
		 synchronized(this){
		
			 if(this.getMoney() >= getMoney){
				 System.out.println(Thread.currentThread().getName()+":取款:"+getMoney);
				 this.setMoney(this.getMoney() - getMoney);
				
				 return getMoney;
			 }else{
				 System.out.println("金额不足");
				 return 0 ;
			 }
		 }	
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", money=" + money + "]";
	}
	
	
}
