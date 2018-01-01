package org.fkjava.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class TestWebWithDom4j {

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
			Element root_node = doc.getRootElement();
			
			// 定义存储找到的<servlet-name>的变量
			String servlet_name = null;
			// 查询所有的<servlet-mapping>子元素
			List<Element> mapping_node_list = root_node.elements("servlet-mapping");
			for(Element mapping_node: mapping_node_list){
				// 匹配<url-pattern>的内容是否和参数最后的url相等
				String pattern = mapping_node.elementText("url-pattern");
				if(path.equals(pattern)){
					// 找到
					servlet_name = mapping_node.elementText("servlet-name");
					break;
				}
			}
			
			if(servlet_name == null){
				System.out.println("404异常: 找不到请求路径");
			}else{
				// 查询所有的<servlet>子元素
				List<Element> servlet_node_list = root_node.elements("servlet");
				for(Element servlet_node : servlet_node_list){
					// 匹配<servlet-name>的内容是否和刚才找到的<servlet-mapping>子元素的<servlet-name>相同
					String temp = servlet_node.elementText("servlet-name");
					if(servlet_name.equals(temp)){
						System.out.println("找到处理请求的Java类：" + servlet_node.elementText("servlet-class"));
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
	
	/**
	 * 使用dom4j解析web.xml
	 * */
	public static void main(String[] args) {
		TestWebWithDom4j t = new TestWebWithDom4j();
		t.processRequest("http://www.org.fkjava/fkjava/login");

	}

}
