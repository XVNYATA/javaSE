package org.fkjava.weixin;

public class User {
	
	public String dept = "微信产品";
	
	// 之后很少在（实体）类里面直接写main方法进行测试
	public static void main(String[] args) {
		// 默认访问当前类下面的User对象
		User u = new User();
	}
}
