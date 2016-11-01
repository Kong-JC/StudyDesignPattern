package abstract_factory_pattern.producer;

import abstract_factory_pattern.factory.AbstractFactory;
import abstract_factory_pattern.factory.ColorFactory;
import abstract_factory_pattern.factory.ShapeFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factory){
		if(factory.equalsIgnoreCase("Shape")){
			return new ShapeFactory();
		}else if(factory.equalsIgnoreCase("color")){
			return new ColorFactory();
		}
		return null;
	}
	
}
