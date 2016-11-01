package abstract_factory_pattern.factory;

import abstract_factory_pattern.Color;
import abstract_factory_pattern.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	public abstract Shape getShape(String shape);
}