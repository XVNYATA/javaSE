package org.fkjava.bean;

import javax.xml.bind.annotation.XmlElement;

/**
 *  <servlet-mapping>
  	<servlet-name>helloServlet</servlet-name>
  	<url-pattern>/hello</url-pattern>
  </servlet-mapping>
 * */
public class ServletMapping {
	
	private String name;
	private String urlPattern;
	public ServletMapping() {
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
	public String getUrlPattern() {
		return urlPattern;
	}
	@XmlElement(name="url-pattern")
	public void setUrlPattern(String urlPattern) {
		this.urlPattern = urlPattern;
	}
	@Override
	public String toString() {
		return "ServletMapping [name=" + name + ", urlPattern=" + urlPattern
				+ "]";
	}
	
	

}
