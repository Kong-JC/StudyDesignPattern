package abstract_factory_pattern;

import abstract_factory_pattern.factory.AbstractFactory;
import abstract_factory_pattern.producer.FactoryProducer;

/**
 * 超级工厂模式
 */
public class AbstractFactoryPatternDemo {

	public static void main(String[] msg) {

		AbstractFactory af = null;

		af = new FactoryProducer().getFactory("shape");

		Shape shape = null;

		shape = af.getShape("circle");
		shape.draw();

		shape = af.getShape("rectangle");
		shape.draw();

		shape = af.getShape("square");
		shape.draw();

		af = new FactoryProducer().getFactory("color");

		Color color = null;

		color = af.getColor("red");
		color.fill();

		color = af.getColor("green");
		color.fill();

		color = af.getColor("blue");
		color.fill();

	}

}
