package org.fkjava.test;

import org.fkjava.bean.Man;
import org.fkjava.bean.Person;

public class Test5 {

	public static void main(String[] args) {
		// 在强制类型转换的时候，可能会出现转型异常。
        // 为了解决这个问题，java提供了一个运算符 instanceof
		Person p = new Man();
		// 判断p引用变量是不是Man类型
		boolean flag = p instanceof Man;
		System.out.println(flag);
		// 如果返回true，说明p引用是可以转成Man的
		if(flag){
			Man m = (Man)p;
			m.play();
		}else{
			System.out.println("不能转换");
		}

	}

}
