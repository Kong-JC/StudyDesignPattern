package abstract_factory_pattern.factory;

import abstract_factory_pattern.Color;
import abstract_factory_pattern.Shape;
import abstract_factory_pattern.color.Blue;
import abstract_factory_pattern.color.Green;
import abstract_factory_pattern.color.Red;

public class ColorFactory extends AbstractFactory {

	public Color getColor(String color) {
		if(color == null){
			return null;
		}else if(color.equalsIgnoreCase("red")){
			return new Red();
		}else if(color.equalsIgnoreCase("green")){
			return new Green();
		}else if(color.equalsIgnoreCase("blue")){
			return new Blue();
		}
		return null;
	}

	public Shape getShape(String shape) {
		return null;
	}

}
