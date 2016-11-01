package bridge_pattern;

/**
 * Created by Kong on 2016/11/1.
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 100, 100, 10);
        Shape greedCircle = new Circle(new GreedCircle(), 100, 100, 10);

        redCircle.draw();
        greedCircle.draw();

    }

}
