package mxdxTest;

public class This_关键字使用1 {
	
	private String name ;
	
	public This_关键字使用1(String name){
		// this 在构造器中代表正在创建的对象
		this.name = name;
	//  t1.name = "李刚";
	}
	
	public static void main(String[] args) {
		This_关键字使用1 t1 = new This_关键字使用1("李刚");
		
		System.out.println(t1.name);
	}
}
