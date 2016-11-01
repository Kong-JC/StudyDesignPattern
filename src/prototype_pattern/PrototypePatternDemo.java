package prototype_pattern;

/**
 * 原型模式
 */
public class PrototypePatternDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape circleShape = ShapeCache.getShape("1");
		System.out.println("Shape : " + circleShape.getType());	
		
		Shape squareShape = ShapeCache.getShape("2");
		System.out.println("Shape : " + squareShape.getType());
		
		Shape rectangleShape = ShapeCache.getShape("3");
		System.out.println("Shape : " + rectangleShape.getType());
	}

}
