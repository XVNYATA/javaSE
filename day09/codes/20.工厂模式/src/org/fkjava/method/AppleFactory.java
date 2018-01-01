package org.fkjava.method;

import org.fkjava.bean.Apple;
import org.fkjava.bean.Fruit;

public class AppleFactory extends FarmerFactory {

	@Override
	public Fruit getFruit() {
		
		return new Apple();
	}

}
