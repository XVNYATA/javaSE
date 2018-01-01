package org.fkjava.test;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.fkjava.bean.Book;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public class TestJAXB {
	
	public static void main(String[] args) {
		try {
			InputStream is = TestDom4j.class.getResourceAsStream("/book.xml");
			
			// 得到工厂的实例
			XPathFactory factory = XPathFactory.newInstance();
			// 利用工厂产生一个XPath实例
			XPath xpath = factory.newXPath();
			// 查询id为2的book元素
			String path = "/books/book[id='2']";
			// 把输入流包装成InputSource，进行查询
			InputSource bookSource = new InputSource(is);
			//  计算指定 InputSource 上下文中的 XPath 表达式并返回指定类型的结果。
			Node bookNode = (Node)xpath.evaluate(path, bookSource, XPathConstants.NODE);
			// 创建JAXB的Context，获得解码器
			Unmarshaller unmarshaller = JAXBContext.newInstance(Book.class)
					.createUnmarshaller();
			// 进行解码
			Book b = (Book) unmarshaller.unmarshal(bookNode);
			System.out.println(b);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
