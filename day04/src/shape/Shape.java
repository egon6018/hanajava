package shape;

public abstract class Shape {
    protected int x;
    protected int y;

    public Shape() {
    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea(); // 넓이 구하기 - 추상메소드 - 전제조건: 추상클래스 안에서만 선언가능

    public abstract double getCircume(); // 둘레 구하기 - 추상메소드 - 전제조건: 추상클래스 안에서만 선언가능

    public void left(int x){ // 추상클래스 안에는 일반 메소드도 만들 수 있음
        this.x += x;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
