package bridge_pattern;

/**
 * Created by Kong on 2016/11/1.
 */
public class GreedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: greed, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
