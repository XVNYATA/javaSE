package org.fkjava.sl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TestSerializeWrite {
	public static void main(String[] args) {
		try(
				/** 提供一个对象输入流：将对象保存到磁盘   */
				OutputStream os = new FileOutputStream(new File("src/org/fkjava/sl/stu.bin"));
				ObjectOutputStream oos = new ObjectOutputStream(os);
				) {
			
			Student stu = new Student(1,"003197", "代勇", "j1603");
		    
			/** 将对象保存到对象输出流对应的磁盘   ：对象序列化
			 *    一旦对象序列化 对象自己就会去调用对象中的writeObject序列化方法
			 *  */
			oos.writeObject(stu);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
