package org.fkjava.statics;

import org.fkjava.statics.Outer.Inner;

public class Test {

	public static void main(String[] args) {
		// 如果创建对象不需要外部类的对象就可以创建;
		Inner inner = new Inner();
		inner.test();
		// 可以直接调用静态内部类中的静态方法.
		// [外部类名].[内部类名].[方法名]
		Outer.Inner.hello();

	}

}
