package org.fkjava.bean;

public class User {

	private static User instance;
	
	private String name;

	public String getName(){
		return this.name;
	}
	
	private User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static User getInstance(){
		if(instance == null){
			instance = new User();
		}
		return instance;
	}

}






