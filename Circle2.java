package baitap1_2;

public class Circle2 {
    private double radius = 1.0;

    public Circle2() {
        this.radius = 1.0;
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Circle2[radius=" + radius + "]";
    }
}
