package baitap1_1;

public class TestCircle {
    public static void main(String[]args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5);
        Circle c3 = new Circle(3.5, "blue");

        System.out.println(c1);
        System.out.println("Area = " + c1.getArea());
        System.out.println(c2);
        System.out.println("Area = " + c2.getArea());
        System.out.println(c3);
        System.out.println("Area = " + c3.getArea());
    }
}
