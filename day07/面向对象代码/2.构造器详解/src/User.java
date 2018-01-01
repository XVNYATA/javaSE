
//  构造器中使用this调用
public class User {
	
	public String name;
	public String sex;
	
	public User(){
		// 1. 
//		this.name = "jack";
//		this.sex = "男";
		// this必须放在构造器的第一行
		this("jack","男");
		System.out.println("User()构造器执行");
		// 想给name和sex赋值

	}
	
	public User(String name,String sex){
		this.name = name;
		this.sex = sex;
	}

}
