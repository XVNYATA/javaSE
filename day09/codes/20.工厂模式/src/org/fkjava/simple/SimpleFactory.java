package org.fkjava.simple;

import org.fkjava.bean.Apple;
import org.fkjava.bean.Banana;
import org.fkjava.bean.Fruit;
import org.fkjava.bean.Orange;

public class SimpleFactory {
	
	// 工厂方法，创建并返回水果对象
	public static Fruit getFruit(){
//		return new Apple();
//		return new Banana();
		return new Orange();
	}

}
