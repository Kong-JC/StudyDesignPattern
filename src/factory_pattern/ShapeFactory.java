package factory_pattern;

public class ShapeFactory {

	public Shape getShpare(String shapeType){
		if(shapeType == null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		return null;
	}
	
}
