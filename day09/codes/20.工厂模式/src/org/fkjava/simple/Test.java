package org.fkjava.simple;

import org.fkjava.bean.Fruit;

public class Test {

	/**
	 * 让对象的调用者和对象创建过程分离，当对象调用者需要对象时，直接向工厂请求即可。
	从而避免了对象的调用者与对象的实现类以硬编码方式耦合，以提高系统的可维护性、可扩展性。
	简单工厂模式也有一个小小的缺陷：缺点是当产品修改时，工厂类也要做相应的修改。
	有个农夫，可以种植水果(苹果、香蕉、桔子)使用简单模式完成
	
	业务
	1. 接收登录名和密码
	2. 获得一个持久层对象，调用login(String loginname,String password)
	
	获得持久层对象的方式：
	1. 直接new，例如oracle持久层，mysql持久层，这时候的问题是，绑定数据库持久层。
	如果需要切换数据库，在业务代码里面需要改代码。
	
	2. 通过工厂获得持久层对象，如果需要切换数据库，
	不需要在业务代码里面需要改代码，而是在工厂里面改代码。
	 * */
	public static void main(String[] args) {
		// 没有new对象，没有关系
		Fruit f = SimpleFactory.getFruit();
		System.out.println(f.getName());

	}

}
