package org.fkjava.p;

public class TestPerson {
	
	// String 类  Person 类
	// 参数是父类，传递的时候可以传递子类实例，会自动转换类型
	public void test(Person p){
		
	}

	public static void main(String[] args) {
		Student s = new Student();
		TestPerson t = new TestPerson();
		// 传递的s是Person的子类
		t.test(s);

	}

}
