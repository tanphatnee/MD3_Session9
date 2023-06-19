package bt4;

public class Circle extends Shape{
    public static final double PI = 3.14;
    private double radius;

    public Circle() {

    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    String display() {
        return null;
    }

    @Override
    double getArea() {
        return PI*radius*radius;
    }

    @Override
    public String toString() {
        return "Circle || " +
                "   radius=" + radius +
                "    \u001B[33m co dien tich" + getArea()+
                "   ||";
    }
}
