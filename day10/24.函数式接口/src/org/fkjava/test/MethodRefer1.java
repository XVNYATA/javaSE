package org.fkjava.test;

@FunctionalInterface
interface Converter{
	
	Integer convert(String from);
}

public class MethodRefer1 {

	public static void main(String[] args) {
		// 1. 引用类方法  将字符串参数转成整形
		// 下面代码使用Lambda表达式创建Converter对象
//		Converter converter1 = from -> Integer.valueOf(from);
//		// 方法引用代替Lambda表达式：引用类方法。
//		// 函数式接口中被实现方法的全部参数传给该类方法作为参数。
		Converter converter1 = Integer::valueOf;
		Integer val = converter1.convert("99");
		System.out.println(val); // 输出整数99
		
		// 2. 引用特定对象的实例方法  ,获得参数在fkit.org字符串中的索引
		// 下面代码使用Lambda表达式创建Converter对象
//		Converter converter2 = from -> "fkit.org".indexOf(from);
//		// 方法引用代替Lambda表达式：引用特定对象的实例方法。
//		// 函数式接口中被实现方法的全部参数传给该方法作为参数。
		Converter converter2 = "fkit.org"::indexOf;
		Integer value = converter2.convert("it");
		System.out.println(value); // 输出2

	}

}
