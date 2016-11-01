package factory_pattern;

/**
 * 工厂模式
 *
 * @author Kong
 *
 */
public class FactoryPatternDemo {

	public static void main(String[] args) {

		ShapeFactory sf = new ShapeFactory();

		Shape circle = sf.getShpare("Circle");
		circle.draw();

		Shape square = sf.getShpare("square");
		square.draw();

		Shape rectangle = sf.getShpare("rectangle");
		rectangle.draw();

		System.out.println("------------------------------");

		Shape shape = null;

		shape = sf.getShpare("square");
		shape.draw();
		shape = sf.getShpare("Circle");
		shape.draw();
		shape = sf.getShpare("rectangle");
		shape.draw();

	}

}
