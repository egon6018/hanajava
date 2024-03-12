package shape;

public class Circle extends Shape{
    private double r;

    public Circle() {
    }

    public Circle(int x, int y, double r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public double getArea() {
        return r * r * Math.PI;
    }

    @Override
    public double getCircume() {
        return 2 * Math.PI * r;
    }

    public double getRadius(){
        return r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
