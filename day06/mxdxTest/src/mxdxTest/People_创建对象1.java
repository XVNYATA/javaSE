package mxdxTest;


public class People_创建对象1 {
	
	public People_创建对象1(){
		
	}
	
	public People_创建对象1(int a){
		
	}
	
	public static void main(String[] args) {
		/** 一个类会默认自带一个无参数的构造器 
		 *  但是，如果你自定义一个有参数的构造器,无参数的构造器就没有了
		 *  所以，当定义一个有参数的构造器的时候，最好也将无参数的构造器定义出来
		 * */
		People_创建对象1 p1 = new People_创建对象1();
		System.out.println(p1);
	}
}


