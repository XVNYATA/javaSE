
public class Person {
	// 全局变量 
	public String name;
	public String sex;
	
	// 构造器常用来做初始化操作
	public Person(){
		System.out.println("Person()构造器执行");
		this.name = "jack";
		this.sex = "男";
	}
	
	// 1：形参的类型不同
	public Person(int age){
		
	}
	// 1：形参的类型不同
	// 2. 形参的类型相同，但是形参的个数不同
	public Person(String name){
		
	}
	
	/* 1： 不允许，因为形参类型相同
	 * public Person(String age){
		
	}*/
	
	
	// 2. 形参的类型相同，但是形参的个数不同
	// 传递两个参数的构造器，用于赋值
	public Person(String name,String sex){ // 局部变量
		System.out.println("有参数构造器执行");
		this.name = name;
		this.sex = sex;
	}
	
	// 3. 形参的类型、个数都相同，但是形参的顺序不同
	public Person(String name,int age){
		
	}
	// 3. 形参的类型、个数都相同，但是形参的顺序不同
	public Person(int age,String name){
		
	}
	
	/* ×形参类型、个数、顺序都相同，但是参数的名称不同
	 * public Person(String address,String password){
		
	}*/
	
	/* ×形参类型、个数、顺序都相同，但是构造器的修饰符不同
	 * private Person(String name,String sex){ 
		
	}*/
	

}
