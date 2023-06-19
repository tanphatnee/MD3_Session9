package bt4;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    String display() {
        return null;
    }

    @Override
    double getArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle  ||" +
                "   color: " + getColor()+
                 "   \u001B[31m  width: " + width +
                "   height : " + height +
                "   có diện tich: " + getArea() +
                "||";
    }
}
