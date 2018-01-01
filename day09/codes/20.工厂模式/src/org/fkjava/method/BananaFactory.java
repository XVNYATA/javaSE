package org.fkjava.method;

import org.fkjava.bean.Banana;
import org.fkjava.bean.Fruit;

public class BananaFactory extends FarmerFactory {

	@Override
	public Fruit getFruit() {
		
		return new Banana();
	}

}
