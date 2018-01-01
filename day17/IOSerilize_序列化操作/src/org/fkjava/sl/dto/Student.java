package org.fkjava.sl.dto;

import java.io.Serializable;

/**
 * @Author xlei 
 * @Version 1.0
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Date 2016年5月3日上午10:03:14
 * @From http://www.fkjava.org
 *  dto : DATA　TRANSFER OBJECT 
 *        数据     传输           对象 
 */
public class Student implements Serializable {
	private int id ;
	private String name;
	private String className;
	private Teacher teacher;
	/**transient:申明这个成员变量不参与序列化  */
	private transient String passWord;
	
	public Student(){
		
	}
	
	public Student(int id , String name , String className,String passWord){
		this.id  = id;
		this.name = name;
		this.className = className;
		this.passWord = passWord;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", className="
				+ className + ", teacher=" + teacher + ", passWord=" + passWord
				+ "]";
	}

    	
	
	
}
