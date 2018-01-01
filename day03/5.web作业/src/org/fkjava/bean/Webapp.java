package org.fkjava.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="web-app")
public class Webapp {
	
	private List<Servlet> servlets;
	private List<ServletMapping> servletMappings;

	public List<Servlet> getServlets() {
		return servlets;
	}

	@XmlElement(name="servlet")
	public void setServlets(List<Servlet> servlets) {
		this.servlets = servlets;
	}

	public List<ServletMapping> getServletMappings() {
		return servletMappings;
	}

	@XmlElement(name="servlet-mapping")
	public void setServletMappings(List<ServletMapping> servletMappings) {
		this.servletMappings = servletMappings;
	}

	@Override
	public String toString() {
		return "Webapp [servlets=" + servlets + ", servletMappings="
				+ servletMappings + "]";
	}
	
	

}
