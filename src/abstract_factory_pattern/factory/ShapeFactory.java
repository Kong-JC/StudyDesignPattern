package abstract_factory_pattern.factory;

import abstract_factory_pattern.Color;
import abstract_factory_pattern.Shape;
import abstract_factory_pattern.shape.Circle;
import abstract_factory_pattern.shape.Rectangle;
import abstract_factory_pattern.shape.Square;

public class ShapeFactory extends AbstractFactory {

	public Color getColor(String color) {
		return null;
	}

	public Shape getShape(String shape) {
		if(shape == null){
			return null;
		}else if(shape.equalsIgnoreCase("circle")){
			return new Circle();
		}else if(shape.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}else if(shape.equalsIgnoreCase("square")){
			return new Square();
		}
		return null;
	}

}
