public class TestMyPoint {
    public static void main(String[] args) {
        // Test default constructor
        MyPoint p1 = new MyPoint();
        System.out.println("Default constructor: " + p1);

        // Test parameterized constructor
        MyPoint p2 = new MyPoint(3, 7);
        System.out.println("Parameterized constructor: " + p2);

        // Test setters
        p1.setX(8);
        p1.setY(6);
        System.out.println("After setting values: " + p1);

        // Test getters
        System.out.println("x is: " + p1.getX());
        System.out.println("y is: " + p1.getY());

        // Test setXY method
        p1.setXY(3, 0);
        System.out.println("After setXY(3,0): " + p1);

        // Test distance methods
        MyPoint p3 = new MyPoint(0, 4);
        System.out.println("New point p3: " + p3);

        System.out.println("Distance from p1 to p3: " + p1.distance(p3));
        System.out.println("Distance from p3 to p1: " + p3.distance(p1));
        System.out.println("Distance from p1 to (5,6): " + p1.distance(5, 6));
        System.out.println("Distance from p1 to origin: " + p1.distance());
    }
}
