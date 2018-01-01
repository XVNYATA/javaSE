package org.fkjava.method;

import org.fkjava.bean.Fruit;
import org.fkjava.bean.Orange;

public class OrangeFactory extends FarmerFactory {

	@Override
	public Fruit getFruit() {
		
		return new Orange();
	}

}
