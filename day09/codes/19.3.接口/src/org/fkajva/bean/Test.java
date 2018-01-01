package org.fkajva.bean;

public class Test {

	public static void main(String[] args) {
		Driver d = new OracleDriver();
		d.connect("", "", "");
		// 直接访问接口里面的常量
		System.out.println(Command.CLAZZ);

	}

}
