package baitap4_4;

public class Test {
    public static void main(String[] args){
        System.out.println("=== TEST POINT CLASS ===");
        Point p1 = new Point(1.5f, 2.5f);
        System.out.println("p1: " + p1);

        Point p2 = new Point();
        System.out.println("p2 (default): " + p2);

        p1.setXY(3.0f, 4.0f);
        System.out.println("p1 after setXY(3.0, 4.0): " + p1);

        float[] xy = p1.getXY();
        System.out.println("p1.getXY(): [" + xy[0] + ", " + xy[1] + "]");

        System.out.println();

        // Test MovablePoint class
        System.out.println("=== TEST MOVABLEPOINT CLASS ===");

        // Test constructor with all parameters
        MovablePoint mp1 = new MovablePoint(1.0f, 2.0f, 0.5f, 1.0f);
        System.out.println("mp1: " + mp1);

        // Test constructor with speed only
        MovablePoint mp2 = new MovablePoint(2.0f, 3.0f);
        System.out.println("mp2 (speed only): " + mp2);

        // Test default constructor
        MovablePoint mp3 = new MovablePoint();
        System.out.println("mp3 (default): " + mp3);

        System.out.println();

        // Test speed methods
        System.out.println("=== TEST SPEED METHODS ===");
        System.out.println("mp1 xSpeed: " + mp1.getxSpeed());
        System.out.println("mp1 ySpeed: " + mp1.getySpeed());

        float[] speed = mp1.getSpeed();
        System.out.println("mp1.getSpeed(): [" + speed[0] + ", " + speed[1] + "]");

        mp1.setSpeed(1.5f, 2.5f);
        System.out.println("mp1 after setSpeed(1.5, 2.5): " + mp1);

        System.out.println();

        // Test move method
        System.out.println("=== TEST MOVE METHOD ===");
        MovablePoint mp4 = new MovablePoint(5.0f, 10.0f, 2.0f, 3.0f);
        System.out.println("mp4 initial: " + mp4);

        mp4.move();
        System.out.println("mp4 after move(): " + mp4);

        mp4.move();
        System.out.println("mp4 after 2nd move(): " + mp4);

        mp4.move();
        System.out.println("mp4 after 3rd move(): " + mp4);

        System.out.println();

        // Test chaining move
        System.out.println("=== TEST CHAINING MOVE ===");
        MovablePoint mp5 = new MovablePoint(0.0f, 0.0f, 1.0f, 1.0f);
        System.out.println("mp5 initial: " + mp5);

        mp5.move().move().move();
        System.out.println("mp5 after chaining 3 moves: " + mp5);
    }
}
