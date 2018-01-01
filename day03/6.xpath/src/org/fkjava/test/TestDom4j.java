package org.fkjava.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Text;
import org.dom4j.io.SAXReader;

public class TestDom4j {

	/**
	 * 测试xpath
	 * */
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = TestDom4j.class.getResourceAsStream("/book.xml");
			SAXReader saxReader = new SAXReader();
			Document doc = saxReader.read(is);
			
			// /books/book  选取books元素下所有的 book节点：
			List<Element> book_node_list = doc.selectNodes("/books/book");
			System.out.println(book_node_list.size());
			
			// /books/book[1]  选取books元素下第一个的 book节点：
			Element book_node = (Element) doc.selectSingleNode("/books/book[1]");
			System.out.println(book_node.elementText("name"));
			
			// /books/book/name/text()   选取books元素下所有的 book节点下面的name节点的text
			List<Text> text_list = doc.selectNodes("/books/book/name/text()");
			text_list.forEach(text -> System.out.println(text.getText()));
			
			// /books/book[price>65]/price" 选取price大于65的
			List<Element> price_node_list = doc.selectNodes("/books/book[price>65]/price");
			price_node_list.forEach(price -> System.out.println(price.getText()));
			
			// /books/book[id=2] 选取books元素下的 book节点，条件是book节点的子元素id=2
			Element book_node_2 = (Element) doc.selectSingleNode("/books/book[id=2]");
			System.out.println(book_node_2.elementText("id") + " " + book_node_2.elementText("name"));
			
			// /books/book[@code='c'] 选取books元素下的 book节点，条件是book节点的属性code=c
			Element book_node_c = (Element) doc.selectSingleNode("/books/book[@code='c']");
			System.out.println(book_node_c.elementText("id") + " " + book_node_c.elementText("name"));
			
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

}
