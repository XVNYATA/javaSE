package org.fkjava.test;

import org.fkjava.bean.Man;
import org.fkjava.bean.Person;

public class Test6 {

	public static void main(String[] args) {
		// 创建Person对象
		Person p = new Person();
		// 判断p引用可不可以转成Man
		boolean flag = p instanceof Man;
		System.out.println(flag);
		if(flag){
			Man m = (Man)p;
			m.play();
		}else{
			System.out.println("不能强制转换");
		}

	}

}
