package org.fkjava.abstracts;

import org.fkjava.bean.Apple;
import org.fkjava.bean.Banana;
import org.fkjava.bean.Fruit;
import org.fkjava.bean.Orange;

public class FramerFactory {
	
	/**
	 *  创建并返回水果对象
	 *  @param String name 水果名称
	 *  @return 对应的水果对象
	 */
	public static Fruit getFruit(String name){
		if(name.equals("Apple")){
			return new Apple();
		}
		else if(name.equals("Banana")){
			return new Banana();
		}
		else if(name.equals("Orange")){
			return new Orange();
		}else{
			return null;
		}
	}

}
