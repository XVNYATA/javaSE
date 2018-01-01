package org.fkjava.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.print.Doc;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Text;
import org.dom4j.io.SAXReader;

public class TestWebWithDom4j2 {
	
	/**
	 * 请写一个方法
	 * @param url
	 *  1.获取最后的url(/login),
		2.解析web.xml,
		3.查询所有的<servlet-mapping>子元素,
		匹配<url-pattern>的内容是否和参数最后的url相等,
		如果没有相等的，控制台打印: "404异常: 找不到请求路径"
		
		4.如果匹配到了,查询出<servlet-mapping>当前<url-pattern>对应的<servlet-name>，
		拿到<servlet-name>的内容,
		5.查询所有的<servlet>子元素,
		匹配<servlet>子元素下面的<servlet-name>，
		获取<servlet>子元素下面的<servlet-class>，
		控制台打印: "找到处理请求的Java类: org.fkjava.servlet.HelloServlet"
	 */
	public void processRequest(String url){
		InputStream is = null;
		try {
			// 从字符串最后查找"/"的索引
			int index = url.lastIndexOf("/");
			// 截取字符串
			String path = url.substring(index);
			System.out.println(path);
			
			is = this.getClass().getResourceAsStream("/web.xml");
			SAXReader saxReader = new SAXReader();
			Document doc = saxReader.read(is);
			
			String servletName = null;
			// <servlet-mapping>/<url-pattern>=path/servlet-name
			Element mapping_node = (Element) doc.selectSingleNode("/web-app/servlet-mapping[url-pattern='"+path+"']");
			if(mapping_node != null){
				servletName = mapping_node.elementText("servlet-name");
			}
			
			if(servletName == null){
				System.out.println("404异常: 找不到请求路径");
			}else{
				// <servlet>/<servlet-name>=servletName/servlet-class
				Element servlet_node = (Element) doc.selectSingleNode("/web-app/servlet[servlet-name='"+servletName+"']");
				if(servlet_node != null){
					System.out.println("找到处理请求的Java类：" + servlet_node.elementText("servlet-class"));
					return;
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
		TestWebWithDom4j2 t = new TestWebWithDom4j2();
		t.processRequest("http://www.org.fkjava/fkjava/hello");

	}

}
