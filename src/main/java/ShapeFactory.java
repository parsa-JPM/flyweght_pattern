import java.util.HashMap;

public class ShapeFactory {

    private static final HashMap<ShapeType, Shape> shapes = new HashMap<ShapeType, Shape>();

    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);

        if (shapeImpl == null) {
            shapeImpl = generateShape(type);
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }

    private static Shape generateShape(ShapeType type) {
        if (type.equals(ShapeType.LINE)) {
            return new Line();
        } else if (type.equals(ShapeType.OVAL_FILL)) {
            return new Oval(true);
        } else if (type.equals(ShapeType.OVAL_NOFILL)) {
            return new Oval(false);
        }
        return null;
    }

    public static enum ShapeType {
        OVAL_FILL, OVAL_NOFILL, LINE;
    }
}
