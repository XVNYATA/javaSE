package org.fkjava.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Text;
import org.dom4j.io.SAXReader;

public class TestDom4j2 {

	/**
	 * 测试xpath
	 * */
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = TestDom4j2.class.getResourceAsStream("/student.xml");
			SAXReader saxReader = new SAXReader();
			Document doc = saxReader.read(is);
			
			// <name>周杰伦</name>  获取name是周杰伦的元素
			Element name_node = (Element) doc.selectSingleNode("/students/student[1]/name");
			System.out.println(name_node.getText());
			
			// ancestor 选取当前节点的所有先辈（父、祖父等），注意，这里使用的是name_node
			List<Element> ancestor_list = name_node.selectNodes("ancestor::*");
			System.out.println(ancestor_list.size()); // 3
			// 注意，有3个父节点，student、students、还有一个是当前的Document
//			ancestor_list.forEach(ancestor -> System.out.println(ancestor.getName()));
			
			// ancestor::student 取周杰伦这个节点的当前的名称为student的父节点
			Element ancestor_student = (Element) name_node.selectSingleNode("ancestor::student");
			System.out.println(ancestor_student.getName());
			
			// attribute:class 选取当前节点的class属性
			Attribute class_att = (Attribute) ancestor_student.selectSingleNode("attribute::class");
			System.out.println(class_att.getValue());
			
			// child::* 选取当前节点的所有子元素
			List<Element> child_node_list = ancestor_student.selectNodes("child::*");
			System.out.println(child_node_list.size());
			child_node_list.forEach(child -> System.out.print(child.getName() + "\t"));
			System.out.println();
			
			// child::sex 选取当前节点的sex子元素
			Element sex_node = (Element) ancestor_student.selectSingleNode("child::sex");
			System.out.println(sex_node.getText());
			
			// descendant 选取当前节点的所有后代元素（子、孙等）。
			List<Element> descendants = name_node.selectNodes("descendant::*");
			// name_node是周杰伦，周杰伦没有子节点  0
			System.out.println(descendants.size());
			
			List<Element> student_descendants = ancestor_student.selectNodes("descendant::*");
			// student元素有3个子节点
			System.out.println(student_descendants.size());
			
			// following 选取文档中当前节点的结束标签之后的所有节点。
			List<Element> followings = name_node.selectNodes("following::*");
			System.out.println(followings.size()); // 30
			
			// parent 选取当前节点的父节点。
			List<Element> parent_list = name_node.selectNodes("parent::*");
			System.out.println(parent_list.size()); // 1
			
			// preceding 选取文档中当前节点的开始标签之前的所有节点。[同胞]
			List<Element> precedings = name_node.selectNodes("preceding::*");
			System.out.println(precedings.size()); // 0

			// <name>周杰伦</name>  获取name是周杰伦的元素
			Element age_node = (Element) doc.selectSingleNode("/students/student[1]/age");
			System.out.println(age_node.getText());
			
			// 从age开始找preceding
			List<Element> age_precedings = age_node.selectNodes("preceding::*");
			System.out.println(age_precedings.size()); // 2
			
			// preceding-sibling 选取当前节点之前的所有同级节点。
			List<Element> siblings = name_node.selectNodes("preceding-sibling::*");
			System.out.println(siblings.size()); // 0
			
			// 从age开始找preceding
			List<Element> age_siblings = age_node.selectNodes("preceding-sibling::*");
			System.out.println(age_siblings.size()); // 2
			
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
