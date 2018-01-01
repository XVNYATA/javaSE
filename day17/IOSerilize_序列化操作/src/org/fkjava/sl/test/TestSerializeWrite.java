package org.fkjava.sl.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import org.fkjava.sl.dto.Student;
import org.fkjava.sl.dto.Teacher;

public class TestSerializeWrite {
	public static void main(String[] args) {
		try(
				/** 提供一个对象输入流：将对象保存到磁盘   */
				OutputStream os = new FileOutputStream(new File("src/org/fkjava/sl/dto/stu.bin"));
				ObjectOutputStream oos = new ObjectOutputStream(os);
				) {
			
			Student stu = new Student(1, "代勇", "j1603","003197");
			
			Teacher th = new Teacher();
			th.setId(1);
			th.setName("徐磊");
			stu.setTeacher(th);
		    
			/** 将对象保存到对象输出流对应的磁盘   ：对象序列化 */
			oos.writeObject(stu);
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
