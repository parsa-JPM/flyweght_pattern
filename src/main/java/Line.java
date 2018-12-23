import java.awt.*;

/**
 * Notice that I have intensionally introduced delay in creating the Object of concrete classes to make the point
 * that flyweight pattern can be used for Objects that takes a lot of time while instantiated.
 */
public class Line implements Shape {

    public Line() {
        System.out.println("Creating Line object");

        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics line, int x, int y, int width, int height, Color color) {
        line.setColor(color);
        line.drawLine(x, y, width, height);
    }
}
