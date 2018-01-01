package org.fkjava.sl.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.fkjava.sl.dto.Student;

/**
 * @Author xlei 
 * @Version 1.0
 * @Tel 13360026135
 * @Email 251425887@qq.com
 * @Date 2016年5月3日上午10:18:14
 * @From http://www.fkjava.org
 *   读取序列化对象 : 解析对象
 */
public class TestSerializeReader {
	public static void main(String[] args) {
		try {
			/** 1.定义一个文件对象：序列化对象的地址 */
			File file = new File("src/org/fkjava/sl/dto/stu.bin");
			
			/** 2.获取一个对象输入流  */
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		
		    /** 3.反序列化对象 */
			Student stu = (Student) ois.readObject();
			
			System.out.println("反序列化对象："+stu);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
