package baitap4_1;

public class Cylinder extends Circle3 {
    private double height = 1.0;

    public Cylinder() {
        super();
        height = 1.0;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea()*height;
    }
    public String toString() {      // in Cylinder class
        return "Cylinder: subclass of " + super.toString()  // use Circle's toString()
                + " height=" + height;
    }

}
