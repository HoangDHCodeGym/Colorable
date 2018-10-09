public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Square(4);
        shapes[2] = new Square(5,"green",false);
        for (Shape shape: shapes) {
            if (shape instanceof Colorable) {
                System.out.println(shape.toString());
                ((Colorable) shape).howToColor();
            }
        }
    }
}
