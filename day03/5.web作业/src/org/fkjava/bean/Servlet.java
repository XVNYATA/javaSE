package org.fkjava.bean;

import javax.xml.bind.annotation.XmlElement;
/**
 *  <servlet>
  	<servlet-name>helloServlet</servlet-name>
  	<servlet-class>org.fkjava.servlet.HelloServlet</servlet-class>
  </servlet>
 * */
public class Servlet {
	
	private String name;
	private String clazz;
	
	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	@XmlElement(name="servlet-name")
	public void setName(String name) {
		this.name = name;
	}
	public String getClazz() {
		return clazz;
	}
	@XmlElement(name="servlet-class")
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	@Override
	public String toString() {
		return "Servlet [name=" + name + ", clazz=" + clazz + "]";
	}

}
