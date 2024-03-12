package shape;

public class Rectangle extends Shape{
    private double width;
    private double heigtht;

    public Rectangle() {
    }

    public Rectangle(int x, int y, double width, double heigtht) {
        super(x, y);
        this.width = width;
        this.heigtht = heigtht;
    }

    @Override
    public double getArea() {
        return width * heigtht;
    }

    @Override
    public double getCircume() {
        return 2 * (width + heigtht);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", heigtht=" + heigtht +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
