package org.fkjava.util;

// J1604Arrays类实现FKArrays接口，可以看出FKArrays接口的子类或者实现类
public class J1604Arrays implements FKArrays {

	@Override
	public void process(int[] arrays) {
		System.out.println("J1604Arrays process");
		// 遍历
		for(int a : arrays){
			System.out.print(a + "\t");
		}
		System.out.println();
	}
	
}
