package org.fkjava.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.print.Doc;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Text;
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
			
			String servletName = null;
			// 找<servlet-mapping>子元素下面的<url-pattern>
			List<Element> url_pattern = doc.selectNodes("/web-app/servlet-mapping/url-pattern");
			// 遍历所有的<url-pattern>元素
			for(Element pattern : url_pattern){
				// 判断path和<url-pattern>元素的text是否相同
				if(path.equals(pattern.getText())){
					// 寻找<url-pattern>元素同胞的<servlet-name>
					Element name_node = (Element) pattern.selectSingleNode("preceding-sibling::servlet-name");
					servletName = name_node.getText();
				}
			}
			
			if(servletName == null){
				System.out.println("404异常: 找不到请求路径");
			}else{
				// 找<servlet>子元素下面的<servlet-name>的text
				List<Text> text_list = doc.selectNodes("/web-app/servlet/servlet-name/text()");
				for(Text text : text_list){
					//  如果text的内容和之前找到的<servlet-mapping>下面的<servlet-name>的一致
					if(servletName.equals(text.getText())){
						Element class_node = (Element) text.selectSingleNode("following::servlet-class");
						System.out.println("找到处理请求的Java类: " + class_node.getText());
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
		TestWebWithDom4j t = new TestWebWithDom4j();
		t.processRequest("http://www.org.fkjava/fkjava/hello");

	}

}
