package shape;

public class Triangle extends Shape{
    private double width;
    private double heigtht;

    public Triangle() {
    }

    public Triangle(int x, int y, double width, double heigtht) {
        super(x, y);
        this.width = width;
        this.heigtht = heigtht;
    }

    @Override
    public double getArea() {
        return (width*heigtht) / 2;
    }

    @Override
    public double getCircume() {
        return Math.sqrt(Math.pow(width,2) + Math.pow(heigtht,2)) + width + heigtht;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", heigtht=" + heigtht +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
