package org.fkjava.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.fkjava.bean.Servlet;
import org.fkjava.bean.ServletMapping;
import org.fkjava.bean.Webapp;

public class TestWebWithJAXB {
	
	public void processRequest(String url){
		InputStream is = null;
		try {
			// 从字符串最后查找"/"的索引
			int index = url.lastIndexOf("/");
			// 截取字符串
			String path = url.substring(index);
			System.out.println(path);
			
			JAXBContext jc = JAXBContext.newInstance(Webapp.class);
			
			Unmarshaller u = jc.createUnmarshaller();
			
			is = this.getClass().getResourceAsStream("/web.xml");
			
			Webapp w = (Webapp)u.unmarshal(is);
			
			System.out.println(w);
			
			// 查找
			/**
			 * 3.查询所有的<servlet-mapping>子元素,
				匹配<url-pattern>的内容是否和参数最后的url相等,
				如果没有相等的，控制台打印: "404异常: 找不到请求路径"
			 * */
			String servletName = null;
			// 从解码的对象里面找到所有的ServletMapping对象
			List<ServletMapping> servletMappings = w.getServletMappings();
			// 循环每一个ServletMapping对象，实际就是每一个<servlet-mapping>元素
			for(ServletMapping mapping : servletMappings){
				if(path.equals(mapping.getUrlPattern())){
					servletName = mapping.getName();
					break;
				}
			}
			
			if(servletName == null){
				System.out.println("404异常: 找不到请求路径");
			}else{
				/**
				 * 5.查询所有的<servlet>子元素,
					匹配<servlet>子元素下面的<servlet-name>，
					获取<servlet>子元素下面的<servlet-class>，
				 * */
				List<Servlet> servlets = w.getServlets();
				// 循环每一个Servlet对象，实际就是每一个<servlet>元素
				for(Servlet servlet : servlets){
					if(servletName.equals(servlet.getName())){
						System.out.println("找到处理请求的Java类: " + servlet.getClazz());
						return;
					}
				}
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		TestWebWithJAXB t = new TestWebWithJAXB();
		t.processRequest("http://www.org.fkjava/fkjava/hello22");

	}

}
