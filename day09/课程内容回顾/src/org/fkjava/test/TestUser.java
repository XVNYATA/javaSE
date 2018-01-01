package org.fkjava.test;

import org.fkjava.bean.User;

public class TestUser {

	public static void main(String[] args) {
		User u1 = User.getInstance();
		User u2 = User.getInstance();
		User u3 = User.getInstance();
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);

	}

}
