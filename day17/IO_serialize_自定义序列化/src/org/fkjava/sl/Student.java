package org.fkjava.sl;

import java.io.IOException;
import java.io.Serializable;

public class Student implements Serializable  {
	private int id ;
	
	private String passWord ;
	
	private String name ;
	
	private String className;
	
	/** 序列化方法  */
	private void writeObject(java.io.ObjectOutputStream oos)throws IOException{
		 System.out.println("-----"+this);
		 String passWord = this.passWord;
		 
		 StringBuilder pwd = new StringBuilder();
		 pwd.append(passWord);
		 
		 pwd.insert(0, "4");
		 pwd.insert(2, "_");
		 pwd.reverse();
		 
		 passWord = pwd.toString();
		 
		 this.passWord = passWord;
		 
		 oos.writeInt(this.id);
		 oos.writeUTF(this.name);
		 oos.writeUTF(this.passWord);
		 
		 
				 
	}
	
	
	/** 反序列化方法  */
	private void readObject(java.io.ObjectInputStream ois)throws IOException{
		try {
			
			this.id = ois.readInt();
			this.name = ois.readUTF();
			this.passWord = ois.readUTF();
			
			StringBuilder pwd = new StringBuilder();
			pwd.append(this.passWord);
			
			pwd.reverse(); // 41_23456
			pwd.deleteCharAt(2);
			pwd.deleteCharAt(0);
			
			this.passWord = pwd.toString();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	

	public Student(int id, String passWord, String name, String className) {
		this.id = id;
		this.passWord = passWord;
		this.name = name;
		this.className = className;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", passWord=" + passWord + ", name="
				+ name + ", className=" + className + "]";
	} 
	
	
}
