package org.fkjava.bean;

// 如果没有显式继承父类，默认继承Object
public class Person {
	
	private String name;
	private String sex;
	private Integer age;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String sex, Integer age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	
	/*public int hashCode() {
		return this.age.hashCode() + this.name.hashCode() + this.sex.hashCode();
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}


	/*@Override
	public boolean equals(Object obj){
		// 1. 如果传进来比较的对象是null，则返回false
		if(obj == null){
			return false;
		}
		// 2. 如果传进来的对象和当前对象的内存地址相等，则返回true
		if(this == obj){
			return true;
		}
		// 3. 判断传递进来的对象是不是Person类型
		boolean flag = obj instanceof Person;
		if(flag){
			// 强制转换
			Person temp = (Person)obj;
			if(this.name.hashCode() == temp.name.hashCode()
					&& this.sex.hashCode() == temp.sex.hashCode()
					&& this.age.hashCode() == temp.age.hashCode()){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
		
	}*/
	
	/**
	 * 比较两个对象是否相等(内容)。所有的引用类型的比较，都必须使用equals方法进行比较。
	 * 子类里面为了能够使用自己的规则进行比较，都需要重写equals方法
	 * Person类的比较规则：
	 * name、sex和age必须完全相等 
	 *
	@Override
	public boolean equals(Object obj){
		// 1. 如果传进来比较的对象是null，则返回false
		if(obj == null){
			return false;
		}
		// 2. 如果传进来的对象和当前对象的内存地址相等，则返回true
		if(this == obj){
			return true;
		}
		// 3. 判断传递进来的对象是不是Person类型
		boolean flag = obj instanceof Person;
		if(flag){
			// 强制转换
			Person temp = (Person)obj;
			if(this.name.equals(temp.name)
					&& this.sex.equals(temp.sex)
					&& this.age.equals(temp.age)){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}*/


	/*@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
*/
	
}
