
public class Test {

	public static void main(String[] args) {
		// 创建Person对象
		Person p = new Person();
		// 访问Person对象的name和sex
		System.out.println(p.name + " " + p.sex);
		
		// 自己给Person对象赋值
		Person p2 = new Person();
		p2.name = "张三";
		p2.sex = "女";
		System.out.println(p2.name + " " + p2.sex);
		
		// 通过有参数的构造器给Person赋值
		Person p3 = new Person("李四", "女");
		System.out.println(p3.name + " " + p3.sex);
		
	}

}
