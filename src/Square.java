public class Square extends Shape implements Colorable {
    double side;

    public Square() {
        super();
        side = 1;
    }

    public Square(double side) {
        super();
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square {side: " + this.side + "}";
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
